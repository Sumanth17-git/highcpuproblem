package com.example.payment.helper;

import com.example.payment.service.PaymentProcessingService;
import org.springframework.stereotype.Component;

@Component
public class PaymentHelper {
    
    private final PaymentProcessingService paymentProcessingService;

    public PaymentHelper(PaymentProcessingService paymentProcessingService) {
        this.paymentProcessingService = paymentProcessingService;
    }

    public String initiatePaymentProcessing() {
        return paymentProcessingService.verifyPayment();
    }
}
