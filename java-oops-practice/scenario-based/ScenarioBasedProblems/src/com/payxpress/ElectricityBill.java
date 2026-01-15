package com.payxpress;

public class ElectricityBill extends Bill {

	public ElectricityBill(double amount, String dueDate) {
		super("Electricity", amount, dueDate);
	}

	@Override
	public void sendReminder() {
		System.out.println("Electricity Bill Reminder: Pay before " + dueDate + " to avoid power disconnection.");
	}
}
