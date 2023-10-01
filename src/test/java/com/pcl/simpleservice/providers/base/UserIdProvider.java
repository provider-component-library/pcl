package com.pcl.simpleservice.providers.base;

import com.pcl.provider.BaseProvider;
import com.pcl.simpleservice.model.Input;

public class UserIdProvider extends BaseProvider<Input, Long> {
    @Override
    protected Long getInternal(Input input) {
        return input.getUserId();
    }
}
