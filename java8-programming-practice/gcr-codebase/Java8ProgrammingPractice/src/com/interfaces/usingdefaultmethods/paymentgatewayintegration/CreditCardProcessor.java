package com.interfaces.usingdefaultmethods.paymentgatewayintegration;

public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("Credit Card payment of " + amount + " Rs. completed");
    }
    @Override
    public boolean refund(double amount) {
        System.out.println("Credit Card refund initiated: " + amount + " Rs.");
        return true;
    }
}
