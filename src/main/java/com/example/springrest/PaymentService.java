package com.example.springrest;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException();
    }
}
