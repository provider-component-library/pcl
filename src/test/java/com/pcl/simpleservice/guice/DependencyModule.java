package com.pcl.simpleservice.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.pcl.simpleservice.dependencies.payment.PaymentService;
import com.pcl.simpleservice.dependencies.payment.PaymentServiceDummy;
import com.pcl.simpleservice.dependencies.product.ProductService;
import com.pcl.simpleservice.dependencies.product.ProductServiceDummy;
import com.pcl.simpleservice.dependencies.ship.ShippingService;
import com.pcl.simpleservice.dependencies.ship.ShippingServiceDummy;
import com.pcl.simpleservice.dependencies.tax.TaxService;
import com.pcl.simpleservice.dependencies.tax.TaxServiceDummy;

public class DependencyModule extends AbstractModule {
    @Override
    protected void configure() {}

    @Provides
    @Singleton
    public ProductService productService() {
        return new ProductServiceDummy();
    }

    @Provides
    @Singleton
    public TaxService taxService() {
        return new TaxServiceDummy();
    }

    @Provides
    @Singleton
    public PaymentService paymentService() {
        return new PaymentServiceDummy();
    }

    @Provides
    @Singleton
    public ShippingService shippingService() {
        return new ShippingServiceDummy();
    }
}
