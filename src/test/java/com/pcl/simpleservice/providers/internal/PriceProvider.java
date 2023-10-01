package com.pcl.simpleservice.providers.internal;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import com.pcl.simpleservice.dependencies.product.model.Product;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PriceProvider extends InternalProvider<Double> {
    @Hard
    private final Provider<Product> productProvider;
    @Hard
    private final Provider<Double> taxProvider;

    @Override
    protected Double getInternal(Request request) {
        double basePrice = productProvider.get(request).getPrice();
        double tax = taxProvider.get(request);

        return basePrice * (1 + tax);
    }
}
