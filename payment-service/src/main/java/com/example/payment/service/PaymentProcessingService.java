package com.example.payment.service;

import com.example.payment.utils.ComputationUtil;
import org.springframework.stereotype.Service;

@Service
public class PaymentProcessingService {

    public String verifyPayment() {
        return authorizeTransaction();
    }

    private String authorizeTransaction() {
        return executePayment();
    }

    private String executePayment() {
        return finalizeTransaction();
    }

    private String finalizeTransaction() {
        long startTime = System.currentTimeMillis();

        // Simulate high CPU workload
        long result = ComputationUtil.intensiveComputation();

        long endTime = System.currentTimeMillis();
        return "Payment processed with high CPU load. Computation Result: " + result + 
               ". Time Taken: " + (endTime - startTime) + "ms";
    }
}
