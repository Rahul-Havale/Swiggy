package com.example.Swiggy.payments.factory;

import com.example.Swiggy.payments.IPaymentsProcesser;
import com.example.Swiggy.payments.impl.COD;
import com.example.Swiggy.payments.impl.Card;
import com.example.Swiggy.payments.impl.UPI;

public class PaymentsFactory {
    public static IPaymentsProcesser getPayment(String paymentMode){
        if(paymentMode.equalsIgnoreCase("UPI")) return new UPI();
        if(paymentMode.equalsIgnoreCase("COD")) return new COD();
        if(paymentMode.equalsIgnoreCase("Card")) return new Card();
        throw new IllegalStateException("Unknown Payment Mode " + paymentMode);
    }
}
