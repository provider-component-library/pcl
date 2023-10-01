package com.pcl.simpleservice.dependencies.ship;

import com.pcl.simpleservice.dependencies.ship.model.ShippingServiceInput;
import com.pcl.simpleservice.dependencies.ship.model.ShippingServiceOutput;

public class ShippingServiceDummy implements ShippingService {
    @Override
    public ShippingServiceOutput shipItem(ShippingServiceInput input) {
        return ShippingServiceOutput.builder()
                .trackingNumber(98765)
                .build();
    }
}
