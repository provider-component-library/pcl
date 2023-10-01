package com.pcl.provider;

import com.github.benmanes.caffeine.cache.AsyncCacheLoader;
import com.github.benmanes.caffeine.cache.AsyncLoadingCache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.pcl.exception.ProviderException;
import com.pcl.executor.ProviderExecutor;
import io.vavr.control.Either;
import lombok.RequiredArgsConstructor;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

/** AbstractProvider is an abstract class that implements caching the result or exception for different requests.
 * Subclasses should implement {@link AbstractProvider#providerLogic(Request)}, which will
 * be called only once per request to get the result of the request. All calls to {@link AbstractProvider#get(Request)}
 * for the same request will return the same result or throw the same exception, wrapped by a
 * {@link ProviderException}. The cache is maintained by a {@link AsyncLoadingCache} with weak keys, therefore the
 * {@link Request} objects should <b>NOT BE PERSISTED</b> with strong references as this will prevent the caches be cleared
 * by the Garbage Collector.
 *
 * @param <Output> the type of the results provided by the provider
 */
public abstract class AbstractProvider<Output> implements Provider<Output> {
    protected ProviderExecutor providerExecutor = null;

    public AsyncLoadingCache<Request, Either<Output, ProviderException>> asyncOutputsCache = Caffeine.newBuilder()
            .weakKeys()
            .recordStats()
            .buildAsync(new AsyncRequestResultLoader());

    /** This provider will be evaluated in parallel if this method returns true and the provider has
     * and executor e.g. it's initialized with {@link AbstractProvider#setExecutor(ProviderExecutor)}. By default,
     * providers with executors are going to be parallelized if marked with the {@link com.pcl.annotation.Hard} annotation.
     *
     * @return is the current provider parallelizable
     */
    protected boolean isParallelizable() {
        return providerExecutor != null;
    }

    /** Sets the executor for the provider. If this method is used and {@link AbstractProvider#isParallelizable()} returns
     * true, the provider will be evaluated in parallel.
     *
     * @param executor the executor to be set
     */
    protected void setExecutor(ProviderExecutor executor) {
        this.providerExecutor = executor;
    }

    /** Evaluates the provider asynchronously if the provider {@link AbstractProvider#isParallelizable()}. If not
     * it returns a completed future with the result of the provider.
     *
     * @param request the current request
     * @return a completable future of the provider result
     */
    protected CompletableFuture<?> preload(Request request) {
        return asyncOutputsCache.get(request);
    }

    /** Returns whatever is returned by {@link AbstractProvider#providerLogic(Request)}, or throws an exception returned by
     * it wrapped around a {@link ProviderException}.
     *
     * @param request the current request
     * @return the output of the provider
     * @throws ProviderException if the request has terminated, or a wrapped exception if the {@link AbstractProvider#providerLogic(Request)}
     * has thrown an exception
     */
    @Override
    public Output get(Request request) {
        if (request.isTerminated()) {
            throw new ProviderException("Request[" + request + "] already terminated");
        }

        Either<Output, ProviderException> result = asyncOutputsCache.get(request).join();

        return result.fold(o -> o, ex -> {
            throw ex;
        });
    }

    /** Returns the output of the provider. This method will be called at most once per request by {@link AbstractProvider#get(Request)},
     * with the result or exception cached and returned by future {@link AbstractProvider#get(Request)} calls for the same request.
     *
     * @param request the current request
     * @return the output of the provider
     */
    protected abstract Output providerLogic(Request request) throws Exception;

    @RequiredArgsConstructor
    private class AsyncRequestResultLoader implements AsyncCacheLoader<Request, Either<Output, ProviderException>> {

        private Either<Output, ProviderException> getOutputOrException(Request request) {
            Output result;
            try {
                result = providerLogic(request);
            } catch (Exception ex) {
                return Either.right(ProviderException.wrapException(ex));
            }

            if (result == null) {
                return Either.right(new ProviderException("Provider[" + this + "] returned null"));
            }

            return Either.left(result);
        }

        @Override
        public CompletableFuture<? extends Either<Output, ProviderException>> asyncLoad(Request request, Executor ignored) throws Exception {
            if (!isParallelizable() || providerExecutor == null)
                return CompletableFuture.completedFuture(getOutputOrException(request));

            return CompletableFuture.supplyAsync(() -> getOutputOrException(request), providerExecutor);
        }
    }
}
