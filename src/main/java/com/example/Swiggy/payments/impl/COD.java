package com.example.Swiggy.payments.impl;

import com.example.Swiggy.payments.IPaymentsProcesser;

public class COD implements IPaymentsProcesser {
    @Override
    public String processPayments() {
        return "COD";
    }
}
