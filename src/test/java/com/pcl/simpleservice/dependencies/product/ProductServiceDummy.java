package com.pcl.simpleservice.dependencies.product;

import com.pcl.simpleservice.dependencies.product.model.Product;
import com.pcl.simpleservice.dependencies.product.model.ProductServiceInput;
import com.pcl.simpleservice.dependencies.product.model.ProductType;

public class ProductServiceDummy implements ProductService {
    @Override
    public Product getProduct(ProductServiceInput input) {
        return Product.builder()
                .title("Protein powder")
                .price(5)
                .type(ProductType.SUPPLEMENT)
                .build();
    }
}
