package com.example.payment.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ComputationUtil {

    private static final int NUM_THREADS = Runtime.getRuntime().availableProcessors() * 8; // 🔥 Increased to fully use CPU

    public static long intensiveComputation() {
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);

        for (int i = 0; i < NUM_THREADS; i++) {
            executor.submit(new PaymentProcessingTask()); // Explicit Runnable class
        }

        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return 0; // This will never be reached, but required by method signature
    }
}

// ✅ Runnable class for realistic payment processing workflow
class PaymentProcessingTask implements Runnable {

    @Override
    public void run() {
        startPaymentValidation();
    }

    // 🚀 Simulated Payment Processing Steps (No recursion)
    private void startPaymentValidation() {
        validatePayment();
    }

    private void validatePayment() {
        checkFraudDetection();
    }

    private void checkFraudDetection() {
        validateCardDetails();
    }

    private void validateCardDetails() {
        checkCVVandExpiry();
    }

    private void checkCVVandExpiry() {
        authenticateUser();
    }

    private void authenticateUser() {
        verifyAccountBalance();
    }

    private void verifyAccountBalance() {
        processTransaction();
    }

    private void processTransaction() {
        deductFunds();
    }

    private void deductFunds() {
        generateTransactionId();
    }

    private void generateTransactionId() {
        updateLedger();
    }

    private void updateLedger() {
        logTransactionDetails();
    }

    private void logTransactionDetails() {
        performSecurityChecks();
    }

    private void performSecurityChecks() {
        sendPaymentConfirmation();
    }

    private void sendPaymentConfirmation() {
        startHighCpuProcessing(); // 🔥 Ensures high CPU usage
    }

    private void startHighCpuProcessing() {
        performComplexCalculations();
    }

    // 🚀 Heavy computation to **maximize CPU load**
    private void performComplexCalculations() {
        long sum = 0;
        while (true) {  // 🔥 Infinite loop to keep CPU at 100%
            sum += complexMathOperations();
        }
    }

    // 🚀 Complex math operations to prevent compiler optimizations
    private long complexMathOperations() {
        long result = 0;
        for (long i = 0; i < 50_000_000; i++) {  // 🔥 Increased workload per iteration
            result += Math.sqrt(i) * Math.sin(i) * Math.cos(i);
        }
        return result;
    }
}
