package com.pcl.simpleservice.model;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Input {
    long userId;
    long productId;
    String countryCode;
}
