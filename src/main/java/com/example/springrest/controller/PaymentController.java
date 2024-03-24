package com.example.springrest.controller;

import com.example.springrest.domain.PaymentDetails;
import com.example.springrest.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("payment")
    public ResponseEntity<?> makePayment(
            @RequestBody PaymentDetails paymentDetails
            ) {
        System.out.println("received payment: " + paymentDetails.amount());
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);

    }
}
