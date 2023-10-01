package com.pcl.provider;

import com.pcl.executor.ProviderExecutor;

/** This class is made to be used to initialize internal providers with executors.
 */
public class ProviderInitializer {
    /** Initializes an internal provider with an executor. This method returns the internal provider and can
     * be used in initializations directly like so:
     * <pre>
     * return ProviderInitializer.getInternal(provider, executor);
     * </pre>
     * @param provider the provider to be initialized
     * @param executor the executor to initialize the executor with
     * @return the initialized internal provider
     */
    public static <U, T extends InternalProvider<U>> T internal(InternalProvider<? extends U> provider, ProviderExecutor executor) {
        provider.init(executor);

        return (T) provider;
    }

    /** Initializes an internal provider without an executor. The provider will not be parallelized even if it is a
     * hard dependency of other providers. This method returns the internal provider and can be used in initializations
     * directly like so:
     * <pre>
     * return ProviderInitializer.getInternal(provider, executor);
     * </pre>
     * @param provider the provider to be initialized
     * @return the initialized internal provider
     */
    public static <U, T extends InternalProvider<U>> T internal(InternalProvider<U> provider) {
        provider.init();

        return (T) provider;
    }
}
