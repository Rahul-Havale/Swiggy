package com.example.Swiggy.service;

import com.example.Swiggy.payments.IPaymentsProcesser;
import com.example.Swiggy.payments.factory.PaymentsFactory;
import com.example.Swiggy.model.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public String handlePayment(Payment payment){
        IPaymentsProcesser processer = PaymentsFactory.getPayment(payment.getPaymentMode());
        return processer.processPayments();
    }

}
