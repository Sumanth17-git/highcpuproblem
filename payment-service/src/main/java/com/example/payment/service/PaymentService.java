package com.example.payment.service;

import com.example.payment.helper.PaymentHelper;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    
    private final PaymentHelper paymentHelper;

    public PaymentService(PaymentHelper paymentHelper) {
        this.paymentHelper = paymentHelper;
    }

    // Entry point for payment processing (simulating pass-through logic)
    public String startPaymentProcessing() {
        return paymentHelper.initiatePaymentProcessing();
    }
}
