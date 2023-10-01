package com.pcl.executor;

import lombok.experimental.UtilityClass;

import java.util.concurrent.*;

/**
 * Utility class for instantiating ProviderExecutor objects. It is recommended using a cached pool executor
 * (via {@link ProviderExecutors#newCachedThreadPool()} for example), because fixed thread executors
 * cannot queue jobs. (Queuing is dangerous because it can cause deadlocks, when all active threads are waiting
 * for results of providers waiting in the queue).
 */
@UtilityClass
public class ProviderExecutors {
    private final static RejectedExecutionHandler SEQUENTIAL_TASK_EXECUTION_HANDLER = (runnable, executor) -> {
        runnable.run();
    };

    /** Creates a new ProviderExecutor with a fixed number of threads. The main difference between this method
     * and {@link Executors#newFixedThreadPool(int)} is that this executor doesn't have a queue that
     * holds an unbounded number of tasks, but uses a synchronous queue that rejects every task after the thread
     * limit has been reached. All rejected threads are then executed, while blocking the thread that submitted
     * the task to the executor. This guarantees that every request will terminate, as using a regular fixed
     * thread pool executor can result in situations, where all active threads are waiting on providers in the queue
     * to complete before continuing.
     *
     * @param nThreads - the number of threads in the pool
     * @return a ProviderExecutor with a fixed amount of threads
     */
    public static ProviderExecutor newFixedThreadPool(int nThreads) {
        return new ProviderExecutor(new ThreadPoolExecutor(
                nThreads, nThreads,
                0L, TimeUnit.MILLISECONDS,
                new SynchronousQueue<>(),
                SEQUENTIAL_TASK_EXECUTION_HANDLER)
        );
    }

    /** Creates a new ProviderExecutor with a fixed amount of threads. The main difference between this method
     * and {@link Executors#newFixedThreadPool(int)} is that this executor doesn't have a queue that
     * holds an unbounded amount of tasks, but uses a synchronous queue that rejects every task after the thread
     * limit has been reached. All rejected threads are then executed, while blocking the thread that submitted
     * the task to the executor. This guarantees that every request will terminate as using a regular fixed
     * thread pool executor can result in situations, where all active threads are waiting on providers in the queue
     * to complete before continuing. Similar to {@link ProviderExecutors#newFixedThreadPool(int)}, but uses a custom
     * ThreadFactory.
     *
     * @param nThreads - the number of threads in the pool
     * @param threadFactory the factory to use when creating new threads
     * @return a {@link ProviderExecutor} with a fixed amount of threads
     */
    public static ProviderExecutor newFixedThreadPool(int nThreads, ThreadFactory threadFactory) {
        return new ProviderExecutor(new ThreadPoolExecutor(
                nThreads, nThreads,
                0L, TimeUnit.MILLISECONDS,
                new SynchronousQueue<>(),
                threadFactory,
                SEQUENTIAL_TASK_EXECUTION_HANDLER)
        );
    }

    /**
     * Uses {@link ProviderExecutors#newFixedThreadPool(int)} to initialize a {@link ProviderExecutor} that doesn't
     * queue jobs.
     *
     * @return a {@link ProviderExecutor} with a capacity for 1 thread.
     */
    public static ProviderExecutor newSingleThreadExecutor() {
        return newFixedThreadPool(1);
    }

    /**
     * Uses {@link ProviderExecutors#newFixedThreadPool(int, ThreadFactory)} to initialize a {@link ProviderExecutor} that doesn't
     * queue jobs.
     *
     * @param threadFactory the factory to use when creating new threads
     * @return a {@link ProviderExecutor} with a capacity for 1 thread.
     */
    public static ProviderExecutor newSingleThreadExecutor(ThreadFactory threadFactory) {
        return newFixedThreadPool(1, threadFactory);
    }

    /** A wrapped {@link Executors#newCachedThreadPool()}. The recommended executor for providers.
     *
     * @return a cached thread pool wrapped around a {@link ProviderExecutor}
     */
    public static ProviderExecutor newCachedThreadPool() {
        return new ProviderExecutor(Executors.newCachedThreadPool());
    }

    /** A wrapped {@link Executors#newCachedThreadPool(ThreadFactory)}. The recommended executor for providers if you need
     * to use a custom thread factory.
     *
     * @param threadFactory the factory to use when creating new threads
     * @return a cached thread pool wrapped around a {@link ProviderExecutor}
     */
    public static ProviderExecutor newCachedThreadPool(ThreadFactory threadFactory) {
        return new ProviderExecutor(Executors.newCachedThreadPool(threadFactory));
    }

    /**
     * Creates a Provider from a ThreadPoolExecutor. Performs checks for whether the queue type is a synchronous queue
     * in order to prevent queueing if the thread pool is of unlimited size.
     * @param threadPoolExecutor the {@link ThreadPoolExecutor} to be wrapped
     * @return a {@link ProviderExecutor} wrapping the input
     */
    public static ProviderExecutor from(ThreadPoolExecutor threadPoolExecutor) {
        if (threadPoolExecutor.getMaximumPoolSize() != Integer.MAX_VALUE &&
                !(threadPoolExecutor.getQueue() instanceof SynchronousQueue<Runnable>))
            throw new IllegalArgumentException("Creating a ProviderExecutor with a limited amount of threads and " +
                    "a non-synchronous queue that queues extra threads can lead to non-terminating provider evaluations");

        return new ProviderExecutor(threadPoolExecutor);
    }

    /** Wraps an arbitrary executor around a ProviderExecutor. Consider using one of the other methods in the class in
     * order to prevent deadlocks when scheduling the provider executions.
     *
     * @param executor the {@link Executor} to be wrapped
     * @return a {@link ProviderExecutor} wrapping the input
     */
    public static ProviderExecutor fromUnsafe(Executor executor) {
        return new ProviderExecutor(executor);
    }
}
