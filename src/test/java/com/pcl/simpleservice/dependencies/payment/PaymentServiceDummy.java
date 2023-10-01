package com.pcl.simpleservice.dependencies.payment;

import com.pcl.simpleservice.dependencies.payment.model.PaymentServiceInput;
import com.pcl.simpleservice.dependencies.payment.model.PaymentServiceOutput;

public class PaymentServiceDummy implements PaymentService {
    @Override
    public PaymentServiceOutput processPayment(PaymentServiceInput input) {
        return PaymentServiceOutput.builder()
                .paymentSuccessful(true)
                .build();
    }
}
