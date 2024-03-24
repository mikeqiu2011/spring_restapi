package com.example.springrest.service;

import com.example.springrest.domain.NotEnoughMoneyException;
import com.example.springrest.domain.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException();
    }
}
