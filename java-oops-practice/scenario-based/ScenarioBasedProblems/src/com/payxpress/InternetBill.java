package com.payxpress;

public class InternetBill extends Bill {

	public InternetBill(double amount, String dueDate) {
		super("Internet", amount, dueDate);
	}

	@Override
	public void sendReminder() {
		System.out
				.println("Internet Bill Reminder: Pay before " + dueDate + " to continue high-speed internet service.");
	}
}
