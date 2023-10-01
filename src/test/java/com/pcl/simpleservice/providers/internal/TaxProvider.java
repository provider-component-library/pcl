package com.pcl.simpleservice.providers.internal;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import com.pcl.simpleservice.dependencies.product.model.Product;
import com.pcl.simpleservice.dependencies.tax.TaxService;
import com.pcl.simpleservice.dependencies.tax.model.TaxServiceInput;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TaxProvider extends InternalProvider<Double> {
    @Hard
    private final Provider<Product> productProvider;
    @Hard
    private final Provider<String> countryCodeProvider;

    private final TaxService taxService;

    @Override
    protected Double getInternal(Request request) {
        return taxService.getTax(buildInput(request)).getTaxPercentage();
    }

    private TaxServiceInput buildInput(Request request) {
        return TaxServiceInput.builder()
                .productType(productProvider.get(request).getType())
                .countryCode(countryCodeProvider.get(request))
                .build();
    }
}
