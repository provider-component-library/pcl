package com.pcl.simpleservice.providers.internal;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import com.pcl.simpleservice.dependencies.payment.PaymentService;
import com.pcl.simpleservice.dependencies.payment.model.PaymentServiceInput;
import com.pcl.simpleservice.dependencies.payment.model.PaymentServiceOutput;
import com.pcl.simpleservice.dependencies.ship.ShippingService;
import com.pcl.simpleservice.dependencies.ship.model.ShippingServiceInput;
import com.pcl.simpleservice.model.PaymentProblemException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TrackingNumberProvider extends InternalProvider<Long> {
    @Hard
    private final Provider<Long> userIdProvider;
    @Hard
    private final Provider<Long> productIdProvider;
    @Hard
    private final Provider<Double> priceProvider;

    private final PaymentService paymentService;
    private final ShippingService shippingService;

    @Override
    protected Long getInternal(Request request) throws PaymentProblemException {
        PaymentServiceOutput paymentResult = paymentService.processPayment(
                PaymentServiceInput.builder()
                        .userId(userIdProvider.get(request))
                        .price(priceProvider.get(request))
                        .build()
        );

        if (!paymentResult.isPaymentSuccessful())
            throw new PaymentProblemException();

        return shippingService.shipItem(ShippingServiceInput.builder()
                .productId(productIdProvider.get(request))
                .userId(userIdProvider.get(request))
                .build()
        ).getTrackingNumber();
    }
}
