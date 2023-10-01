package com.pcl.bigservice;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.pcl.bigservice.providers.GenModule;
import com.pcl.bigservice.providers.pojo.GenInput;
import com.pcl.provider.ProviderRunner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BigServiceTest {
    @Inject
    private ProviderRunner<GenInput, Integer> providerRunner;

    @BeforeEach
    public void before() {
        Injector injector = Guice.createInjector(new GenModule());
        injector.injectMembers(this);
    }

    @Test
    public void test() {
        long start = System.currentTimeMillis();
        providerRunner.runMainProvider(new GenInput());
        long total = System.currentTimeMillis() - start;

        System.out.println("Completed in " + total + "ms");
    }
}
