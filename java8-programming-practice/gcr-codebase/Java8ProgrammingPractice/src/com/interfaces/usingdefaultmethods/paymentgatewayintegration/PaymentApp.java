/*Payment Gateway Integration
○ Scenario: Multiple payment providers integrate with your app. A new refund
method needs to be added without breaking old providers.
○ Task: Add a default refund() method in the PaymentProcessor interface.*/

package com.interfaces.usingdefaultmethods.paymentgatewayintegration;

public class PaymentApp {
	public static void main(String[] args) {

		PaymentProcessor upi = new UpiProcessor();
		PaymentProcessor card = new CreditCardProcessor();

		upi.pay(500);
		upi.refund(200);

		card.pay(1000);
		card.refund(400);
	}
}
