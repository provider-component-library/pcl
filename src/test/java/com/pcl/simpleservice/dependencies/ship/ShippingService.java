package com.pcl.simpleservice.dependencies.ship;

import com.pcl.simpleservice.dependencies.ship.model.ShippingServiceInput;
import com.pcl.simpleservice.dependencies.ship.model.ShippingServiceOutput;

public interface ShippingService {
    ShippingServiceOutput shipItem(ShippingServiceInput input);
}
