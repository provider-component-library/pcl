package com.pcl.provider;

import com.pcl.annotation.Hard;
import com.pcl.exception.ProviderException;
import com.pcl.executor.ProviderExecutor;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A class to represent internal providers which have dependencies on other providers. Dependencies that are needed
 * in the flow for sure can be marked with the {@link Hard} annotation. All hard providers must be final. Such providers
 * will be picked up by the initialization methods (even if they are part of the superclasses of the internal provider)
 * and will be preloaded before each execution of the provider, if they are parallelizable (see {@link AbstractProvider#isParallelizable()}).
 * Every provider needs to be initialized using one of the initialization methods before being called (this should
 * preferably be done during construction using a {@link ProviderInitializer}.
 *
 * @param <Output>
 */
public abstract class InternalProvider<Output> extends AbstractProvider<Output> {
    private List<AbstractProvider<?>> hardDependencies;

    /**
     * Initializes the current provider. If initialized via this method the provider will not be parallelized even
     * if marked as a hard dependency of other provider. The initialization collects all hard dependencies from this class
     * and all superclasses, which will later be parallelized if possible.
     */
    public void init() {
        init(null);
    }

    /**
     * Initializes the current provider with an executor. The provider will run in parallel if preloaded as a {@link Hard}
     * dependency. The initialization collects all hard dependencies from this class and all superclasses, which will
     * later be parallelized if possible.
     *
     * @param executor the executor used to run the provider
     */
    public void init(ProviderExecutor executor) {
        if (hardDependencies != null) {
            throw new IllegalStateException("Provider[" + this + "] has already been initialized");
        }

        hardDependencies = new ArrayList<>();

        Class<?> clazz = this.getClass();

        while (clazz != null) {
            for (Field field : clazz.getDeclaredFields()) {
                if (!Provider.class.isAssignableFrom(field.getType()))
                    continue;

                for (Annotation annotation : field.getDeclaredAnnotations()) {
                    if (annotation instanceof Hard) {
                        if (!Modifier.isFinal(field.getModifiers())) {
                            throw new IllegalArgumentException("Provider[" + this.getClass() + "] has a non-final hard provider dependency: "
                                    + field);
                        }

                        field.setAccessible(true);
                        try {
                            Object provider = field.get(this);
                            if (provider instanceof AbstractProvider) {
                                hardDependencies.add((AbstractProvider) provider);
                            } else {
                                throw new IllegalArgumentException("Provider[" + this.getClass() + "] has dependency marked with @Hard " +
                                        "which is not a subclass of AbstractProvider and cannot be preloaded " + field);
                            }
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException("Provider[" + this.getClass() + "] failed to initialize", e);
                        }
                    }
                }
            }

            clazz = clazz.getSuperclass();
        }

        // don't parallelize non-parallel providers
        hardDependencies = hardDependencies.stream()
                .filter(AbstractProvider::isParallelizable)
                .collect(Collectors.toList());

        setExecutor(executor);
    }

    /** Preloads all hard dependencies async and calls {@link InternalProvider#getInternal(Request)}.
     *
     * @param request the current request
     * @return the output of the provider
     */
    @Override
    protected Output providerLogic(Request request) throws Exception {
        if (hardDependencies == null) {
            throw new ProviderException("Provider[" + this + "] not initialized. Use a ProviderInitializer " +
                    "when creating the provider");
        }

        hardDependencies.forEach(provider -> provider.preload(request));

        return getInternal(request);
    }

    /** Returns the output of the provider for a request
     *
     * @param request the current request
     * @return the output of the provider
     */
    protected abstract Output getInternal(Request request) throws Exception;
}
