package com.pcl.provider;

import lombok.AccessLevel;
import lombok.Getter;

/** A class representing a request context. It is used as a weak key in the cache of {@link AbstractProvider}, therefore
 * should <b>NOT</b> be persisted or the cache of all providers that were evaluated for a request will not be cleared,
 * causing a memory leak.
 */
public class Request {
    Request() {}

    @Getter(AccessLevel.PACKAGE)
    private volatile boolean terminated = false;

    /** Terminates a request after it has finished executing by the {@link ProviderRunner}. All future evaluations by
     * providers for that request will throw exceptions.
     */
    void terminate() {
        terminated = true;
    }
}
