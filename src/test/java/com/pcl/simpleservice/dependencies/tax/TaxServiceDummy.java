package com.pcl.simpleservice.dependencies.tax;

import com.pcl.simpleservice.dependencies.tax.model.TaxServiceInput;
import com.pcl.simpleservice.dependencies.tax.model.TaxServiceOutput;

public class TaxServiceDummy implements TaxService {
    @Override
    public TaxServiceOutput getTax(TaxServiceInput input) {
        return TaxServiceOutput.builder()
                .taxPercentage(10.0)
                .build();
    }
}
