package com.pcl.simpleservice.dependencies.product;

import com.pcl.simpleservice.dependencies.product.model.Product;
import com.pcl.simpleservice.dependencies.product.model.ProductServiceInput;

public interface ProductService {
    Product getProduct(ProductServiceInput input);
}
