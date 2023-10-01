package com.pcl.simpleservice.dependencies.payment;

import com.pcl.simpleservice.dependencies.payment.model.PaymentServiceInput;
import com.pcl.simpleservice.dependencies.payment.model.PaymentServiceOutput;

public interface PaymentService {
    PaymentServiceOutput processPayment(PaymentServiceInput input);
}
