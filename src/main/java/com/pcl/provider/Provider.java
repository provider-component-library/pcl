package com.pcl.provider;

/**
 * An interface for providers.
 *
 * See also:
 * <ul>
 *   <li>{@link AbstractProvider}
 *   <li>{@link InternalProvider}
 *   <li>{@link BaseProvider}
 * </ul>
 *
 * @param <T> the output type
 */
public interface Provider<T> {
    T get(Request request);
}
