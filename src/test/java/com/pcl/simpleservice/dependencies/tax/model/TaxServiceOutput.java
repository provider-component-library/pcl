package com.pcl.simpleservice.dependencies.tax.model;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class TaxServiceOutput {
    double taxPercentage;
}
