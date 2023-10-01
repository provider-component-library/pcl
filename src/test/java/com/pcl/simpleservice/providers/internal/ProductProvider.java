package com.pcl.simpleservice.providers.internal;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import com.pcl.simpleservice.dependencies.product.ProductService;
import com.pcl.simpleservice.dependencies.product.model.Product;
import com.pcl.simpleservice.dependencies.product.model.ProductServiceInput;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductProvider extends InternalProvider<Product> {
    @Hard
    private final Provider<Long> productIdProvider;

    private final ProductService productService;

    @Override
    protected Product getInternal(Request request) {
        return productService.getProduct(buildInput(request));
    }

    private ProductServiceInput buildInput(Request request) {
        return ProductServiceInput.builder()
                .productId(productIdProvider.get(request))
                .build();
    }
}
