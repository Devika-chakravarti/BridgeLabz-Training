package com.interfaces.defininginterfaces.digitalpayment;

public class WalletPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " Rs. using Wallet");
    }
}

