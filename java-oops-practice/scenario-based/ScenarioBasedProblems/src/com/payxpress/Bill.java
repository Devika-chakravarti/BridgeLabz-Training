package com.payxpress;

public abstract class Bill implements IPayable {

	protected String type;
	protected double amount;
	protected String dueDate;
	private boolean isPaid; 

	public Bill(String type, double amount, String dueDate) {
		this.type = type;
		this.amount = amount;
		this.dueDate = dueDate;
		this.isPaid = false;
	}

	public boolean isPaid() {
		return isPaid;
	}

	protected void markPaid() {
		this.isPaid = true;
	}

	// base + penalty
	@Override
	public void pay(double lateFee) {
		if (isPaid) {
			System.out.println(type + " bill already paid.");
			return;
		}
		double total = amount + lateFee;
		System.out.println("Total Payable Amount: " + total);
		markPaid();
		System.out.println(type + " bill paid successfully.");
	}
}
