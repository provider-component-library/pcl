package com.pcl.exception;

/** Exceptions thrown in providers (whether checked or not) will be wrapped around
 * the ProviderException class with the actual exception as the cause.
 */
public class ProviderException extends RuntimeException {
    public ProviderException(String message) {
        super(message);
    }

    public ProviderException(Throwable cause) {
        super(cause);
    }

    public static ProviderException wrapException(Exception ex) {
        if (ex instanceof ProviderException)
            return (ProviderException) ex;

        if (ex.getCause() != null && ex.getCause() instanceof ProviderException)
            return (ProviderException) ex.getCause();

        return new ProviderException(ex);
    }
}
