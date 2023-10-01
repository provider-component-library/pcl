package com.pcl.simpleservice;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.pcl.provider.ProviderRunner;
import com.pcl.simpleservice.guice.ProviderModule;
import com.pcl.simpleservice.model.Input;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleServiceTest {
    @Inject
    private ProviderRunner<Input, Long> mainProviderRunner;

    private Service service;

    private static class C<T> extends S<T> {

    }

    private static class S<T> {

    }

    @BeforeEach
    public void before() {
        Injector injector = Guice.createInjector(new ProviderModule());
        injector.injectMembers(this);

        service = new Service(mainProviderRunner);
    }

    @Test
    public void test() {
        Input input = Input.builder()
                .userId(1)
                .productId(2)
                .countryCode("US")
                .build();

        String trackingNumber = service.process(input).getTrackingNumber();

        assert(trackingNumber.equals("98765"));
    }
}
