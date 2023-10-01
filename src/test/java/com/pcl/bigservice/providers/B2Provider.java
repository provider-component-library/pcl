package com.pcl.bigservice.providers;

import com.pcl.bigservice.providers.pojo.GenInput;
import com.pcl.provider.BaseProvider;

public class B2Provider extends BaseProvider<GenInput, Integer> {
    @Override
    protected Integer getInternal(GenInput input) {
        return input.getInt2();
    }
}
