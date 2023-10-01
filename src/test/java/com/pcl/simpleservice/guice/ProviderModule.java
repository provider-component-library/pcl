package com.pcl.simpleservice.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.pcl.executor.ProviderExecutor;
import com.pcl.executor.ProviderExecutors;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.ProviderInitializer;
import com.pcl.provider.ProviderRunner;
import com.pcl.simpleservice.dependencies.payment.PaymentService;
import com.pcl.simpleservice.dependencies.product.ProductService;
import com.pcl.simpleservice.dependencies.product.model.Product;
import com.pcl.simpleservice.dependencies.ship.ShippingService;
import com.pcl.simpleservice.dependencies.tax.TaxService;
import com.pcl.simpleservice.model.Input;
import com.pcl.simpleservice.providers.base.CountryCodeProvider;
import com.pcl.simpleservice.providers.base.ProductIdProvider;
import com.pcl.simpleservice.providers.base.UserIdProvider;
import com.pcl.simpleservice.providers.internal.PriceProvider;
import com.pcl.simpleservice.providers.internal.ProductProvider;
import com.pcl.simpleservice.providers.internal.TaxProvider;
import com.pcl.simpleservice.providers.internal.TrackingNumberProvider;

public class ProviderModule extends AbstractModule {
    // base
    private static final String COUNTRY_CODE_PROVIDER = "COUNTRY_CODE_PROVIDER";
    private static final String PRODUCT_ID_PROVIDER = "PRODUCT_ID_PROVIDER";
    private static final String USER_ID_PROVIDER = "USER_ID_PROVIDER";
    // internal
    private static final String PRICE_PROVIDER = "PRICE_PROVIDER";
    private static final String PRODUCT_PROVIDER = "PRODUCT_PROVIDER";
    private static final String TAX_PROVIDER = "TAX_PROVIDER";
    private static final String TRACKING_NUMBER_PROVIDER = "TRACKING_NUMBER_PROVIDER";

    @Override
    protected void configure() {
        install(new DependencyModule());
    }

    // base providers
    @Provides
    @Singleton
    @Named(COUNTRY_CODE_PROVIDER)
    public Provider<String> countryCodeProvider() {
        return new CountryCodeProvider();
    }

    @Provides
    @Singleton
    @Named(PRODUCT_ID_PROVIDER)
    public Provider<Long> productIdProvider() {
        return new ProductIdProvider();
    }

    @Provides
    @Singleton
    @Named(USER_ID_PROVIDER)
    public Provider<Long> userIdProvider() {
        return new UserIdProvider();
    }

    // internal providers
    @Provides
    @Singleton
    @Named(PRODUCT_PROVIDER)
    public Provider<Product> productProvider(@Named(PRODUCT_ID_PROVIDER) Provider<Long> productIdProvider,
                                             ProductService productService,
                                             ProviderExecutor providerExecutor) {
        return ProviderInitializer.internal(
                new ProductProvider(productIdProvider,
                        productService), providerExecutor);
    }

    @Provides
    @Singleton
    @Named(TAX_PROVIDER)
    public Provider<Double> taxProvider(@Named(PRODUCT_PROVIDER) Provider<Product> productProvider,
                                        @Named(COUNTRY_CODE_PROVIDER) Provider<String> countryCodeProvider,
                                        TaxService taxService,
                                        ProviderExecutor providerExecutor) {
        return ProviderInitializer.internal(new TaxProvider(productProvider,
                countryCodeProvider,
                taxService), providerExecutor);
    }

    @Provides
    @Singleton
    @Named(PRICE_PROVIDER)
    public Provider<Double> priceProvider(@Named(PRODUCT_PROVIDER) Provider<Product> productProvider,
                                          @Named(TAX_PROVIDER) Provider<Double> taxProvider,
                                          ProviderExecutor providerExecutor) {
        return ProviderInitializer.internal(new PriceProvider(productProvider,
                taxProvider), providerExecutor);
    }

    @Provides
    @Singleton
    @Named(TRACKING_NUMBER_PROVIDER)
    public Provider<Long> trackingNumberProvider(@Named(USER_ID_PROVIDER) Provider<Long> userIdProvider,
                                                 @Named(PRODUCT_ID_PROVIDER) Provider<Long> productIdProvider,
                                                 @Named(PRICE_PROVIDER) Provider<Double> priceProvider,
                                                 PaymentService paymentService,
                                                 ShippingService shippingService,
                                                 ProviderExecutor providerExecutor) {
        return ProviderInitializer.internal(new TrackingNumberProvider(userIdProvider,
                productIdProvider,
                priceProvider,
                paymentService,
                shippingService), providerExecutor);
    }

    @Provides
    @Singleton
    public ProviderRunner<Input, Long> providerRunner(@Named(TRACKING_NUMBER_PROVIDER) Provider<Long> mainProvider) {
        return new ProviderRunner<>(mainProvider);
    }

    @Provides
    @Singleton
    public ProviderExecutor executor() {
        return ProviderExecutors.newCachedThreadPool();
    }
}
