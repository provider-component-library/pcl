package com.pcl.simpleservice.providers.base;

import com.pcl.provider.BaseProvider;
import com.pcl.simpleservice.model.Input;

public class ProductIdProvider extends BaseProvider<Input, Long> {
    @Override
    protected Long getInternal(Input input) {
        return input.getProductId();
    }
}
