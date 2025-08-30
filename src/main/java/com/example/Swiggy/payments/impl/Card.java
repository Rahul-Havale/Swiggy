package com.example.Swiggy.payments.impl;

import com.example.Swiggy.payments.IPaymentsProcesser;

public class Card implements IPaymentsProcesser {
    @Override
    public String processPayments() {
        return "Card Payment";
    }
}
