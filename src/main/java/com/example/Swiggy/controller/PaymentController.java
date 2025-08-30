package com.example.Swiggy.controller;

import com.example.Swiggy.model.Payment;
import com.example.Swiggy.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    //http://localhost:8082/api/payment/create
    @PostMapping("/create")
    public ResponseEntity<Payment> createPayment(
            @RequestBody Payment payment
    ){
        paymentService.handlePayment(payment);
        return ResponseEntity.ok().body(payment);
    }

}
