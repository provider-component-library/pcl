package com.pcl.simpleservice.providers.base;

import com.pcl.provider.BaseProvider;
import com.pcl.simpleservice.model.Input;

public class CountryCodeProvider extends BaseProvider<Input, String> {
    @Override
    protected String getInternal(Input input) {
        return input.getCountryCode();
    }
}
