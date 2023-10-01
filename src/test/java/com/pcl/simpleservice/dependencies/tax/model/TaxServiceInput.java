package com.pcl.simpleservice.dependencies.tax.model;

import com.pcl.simpleservice.dependencies.product.model.ProductType;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class TaxServiceInput {
    ProductType productType;
    String countryCode;
}
