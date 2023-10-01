package com.pcl.simpleservice.dependencies.tax;

import com.pcl.simpleservice.dependencies.tax.model.TaxServiceInput;
import com.pcl.simpleservice.dependencies.tax.model.TaxServiceOutput;

public interface TaxService {
    TaxServiceOutput getTax(TaxServiceInput input);
}
