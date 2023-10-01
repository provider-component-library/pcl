package com.pcl.provider;

import lombok.RequiredArgsConstructor;

/**
 * This class runs a main provider. It is thread-safe.
 *
 * @param <Input> the input type of the requests
 * @param <Output> the output type of the main provider
 */
@RequiredArgsConstructor
public class ProviderRunner<Input, Output> {
    private final Provider<Output> mainProvider;

    /** Runs the main provider with the supplied input and returns its output.
     *
     * @param input the input of the request
     * @return the ouput of the main provider for the request
     * @throws com.pcl.exception.ProviderException throws a ProviderException with the real exception as the cause in case
     * any of the providers needed throw an exception
     */
    public Output runMainProvider(Input input) {
        Output output;
        Request request = BaseProvider.registerRequest(input);

        try {
            output = mainProvider.get(request);
        } finally {
            request.terminate();
            BaseProvider.deregisterRequest(request);
        }

        return output;
    }
}
