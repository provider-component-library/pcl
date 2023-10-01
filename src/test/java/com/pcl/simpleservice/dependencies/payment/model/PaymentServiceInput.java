package com.pcl.simpleservice.dependencies.payment.model;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class PaymentServiceInput {
    long userId;
    double price;
}
