package com.artify;

public class User {

	private String name;
	private double walletBalance;

	// Constructor to initialize user details
	public User(String name, double walletBalance) {
		this.name = name;
		this.walletBalance = walletBalance;
	}

	// Returns user's name
	public String getName() {
		return name;
	}

	// Returns current wallet balance
	public double getWalletBalance() {
		return walletBalance;
	}

	// Updates wallet balance after purchase
	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}
}
