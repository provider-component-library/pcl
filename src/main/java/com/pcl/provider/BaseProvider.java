package com.pcl.provider;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * A class to represent base providers which are only dependent on the input and no other providers.
 * @param <Input> the input type
 * @param <Output> the output type
 */
public abstract class BaseProvider<Input, Output> extends AbstractProvider<Output> {
    private static final Map<Request, Object> ACTIVE_REQUESTS_MAP = new ConcurrentHashMap<>();

    /** Registers the input to a request and generates a new Request
     *
     * @param input - the input
     * @return the new request
     */
    static Request registerRequest(Object input) {
        Request key = new Request();

        ACTIVE_REQUESTS_MAP.put(key, input);

        return key;
    }

    /** Removes the input and request from the base provider cache
     *
     * @param request
     */
    static void deregisterRequest(Request request) {
        ACTIVE_REQUESTS_MAP.remove(request);
    }

    /**
     * Calls the {@link BaseProvider#getInternal(Input)} method with the registered input from the input map.
     *
     * @param request the current request
     * @return the output of the provider
     */
    @Override
    protected Output providerLogic(Request request) {
        return getInternal((Input) ACTIVE_REQUESTS_MAP.get(request));
    }

    /** Returns the output of the base provider for a certain input
     *
     * @param input the request's input
     * @return the output of the provider
     */
    protected abstract Output getInternal(Input input);
}
