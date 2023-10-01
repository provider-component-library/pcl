package com.pcl.simpleservice.dependencies.product.model;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class ProductServiceInput {
    long productId;
}
