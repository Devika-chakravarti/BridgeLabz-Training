package com.sorting.zipzipmart;

public class Sale {
	String date; // YYYYMMDD
	double amount;
	String branch;

	public Sale(String date, double amount, String branch) {
		this.date = date;
		this.amount = amount;
		this.branch = branch;
	}

	void show() {
		System.out.println("Date: " + date + " | Amount: " + amount + " | Branch: " + branch);
	}
}
