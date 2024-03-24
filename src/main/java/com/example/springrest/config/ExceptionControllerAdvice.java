package com.example.springrest.config;

import com.example.springrest.domain.ErrorDetails;
import com.example.springrest.domain.NotEnoughMoneyException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler(){
        var errorDetails = new ErrorDetails("not enough money!!");
        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }
}
