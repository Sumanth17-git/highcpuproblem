package com.example.payment.controller;


import com.example.payment.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PaymentController {
    
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    // Fast responding API
    @GetMapping("/quick-response")
    public String quickResponse() {
        return "Quick response success!";
    }

    // High CPU usage simulation (Passes through multiple layers)
    @GetMapping("/payment")
    public String highCpuPayment() {
        return paymentService.startPaymentProcessing();
    }
}
