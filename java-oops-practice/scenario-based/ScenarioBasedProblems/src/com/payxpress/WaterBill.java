package com.payxpress;

public class WaterBill extends Bill {

	public WaterBill(double amount, String dueDate) {
		super("Water", amount, dueDate);
	}

	@Override
	public void sendReminder() {
		System.out.println(
				"Water Bill Reminder: Please clear dues before " + dueDate + " to ensure uninterrupted water supply.");
	}
}
