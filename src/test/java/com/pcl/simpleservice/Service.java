package com.pcl.simpleservice;

import com.pcl.provider.ProviderRunner;
import com.pcl.simpleservice.model.Input;
import com.pcl.simpleservice.model.Output;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Service {
    private final ProviderRunner<Input, Long> mainProviderRunner;

    public Output process(Input input) {
        long trackingNumber = mainProviderRunner.runMainProvider(input);

        return Output.builder()
                .trackingNumber(Long.toString(trackingNumber))
                .build();
    }
}
