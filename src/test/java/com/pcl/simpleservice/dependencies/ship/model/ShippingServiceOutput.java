package com.pcl.simpleservice.dependencies.ship.model;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class ShippingServiceOutput {
    long trackingNumber;
}
