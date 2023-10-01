package com.pcl.simpleservice.dependencies.product.model;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Product {
    String title;
    double price;
    ProductType type;
}
