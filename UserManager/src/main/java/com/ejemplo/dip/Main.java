package com.ejemplo.dip;

import com.ejemplo.dip.*;
import com.ejemplo.dip.PaymentProcessor;

public class Main 
{
    public static void main(String[] args) {
        PaymentProcessor creditCardProcessor = new PaymentProcessor(new CreditCardPayment());
        PaymentProcessor paypalProcessor = new PaymentProcessor(new PayPalPayment());
        PaymentProcessor cryptoProcessor = new PaymentProcessor(new CryptoPayment());

        creditCardProcessor.makePayment(150.0);
        paypalProcessor.makePayment(85.5);
        cryptoProcessor.makePayment(0.005);
    }
}