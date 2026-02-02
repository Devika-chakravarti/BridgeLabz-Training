/*Digital Payment Interface
○ Scenario: UPI, Credit Card, Wallet all must implement pay() method.
○ Task: Define and implement.*/

package com.interfaces.defininginterfaces.digitalpayment;

public class PaymentApp {
    public static void main(String[] args) {

        PaymentMethod upi = new UpiPayment();
        PaymentMethod card = new CreditCardPayment();
        PaymentMethod wallet = new WalletPayment();

        upi.pay(500);
        card.pay(1200);
        wallet.pay(300);
    }
}
