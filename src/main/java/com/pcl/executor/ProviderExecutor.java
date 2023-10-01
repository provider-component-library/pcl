package com.pcl.executor;

import com.pcl.annotation.Hard;
import lombok.ToString;

import java.util.concurrent.Executor;

/**
 * A class that wraps the executor to be used when executing @{@link Hard} dependencies in parallel. Meant
 * to be instantiated via the methods in the {@link ProviderExecutors} class.
 */

@ToString
public class ProviderExecutor implements Executor {
    private Executor delegate;

    ProviderExecutor(Executor executor) {
        this.delegate = executor;
    }

    public Executor getExecutor() {
        return delegate;
    }

    @Override
    public void execute(Runnable command) {
        delegate.execute(command);
    }
}
