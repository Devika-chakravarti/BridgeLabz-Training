package com.interfaces.usingdefaultmethods.paymentgatewayintegration;

public class UpiProcessor implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("UPI payment of " + amount + " Rs. completed");
    }
}

