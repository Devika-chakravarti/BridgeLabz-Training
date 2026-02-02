package com.interfaces.defininginterfaces.digitalpayment;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " Rs. using Credit Card");
    }
}

