package com.interfaces.usingdefaultmethods.paymentgatewayintegration;

public interface PaymentProcessor {
    void pay(double amount);
    default boolean refund(double amount) {
        System.out.println("Refund processed using default flow: " + amount + " Rs.");
        return true;
    }
}
