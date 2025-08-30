package com.example.Swiggy.payments.impl;

import com.example.Swiggy.payments.IPaymentsProcesser;

public class UPI implements IPaymentsProcesser {

    @Override
    public String processPayments() {
        return "UPI";
    }
}
