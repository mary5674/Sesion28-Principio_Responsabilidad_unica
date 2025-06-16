package com.ejemplo.dip;

import com.ejemplo.dip.PaymentMethod;

public class PaymentProcessor {
    private final PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void makePayment(double amount) {
        paymentMethod.processPayment(amount);
    }
}