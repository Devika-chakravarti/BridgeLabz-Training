package com.jdbcpractice.transactionmanagement;

public class Account {
	private int accountId;
	private String holderName;
	private double balance;

	public Account(int accountId, String holderName, double balance) {
		this.accountId = accountId;
		this.holderName = holderName;
		this.balance = balance;
	}

	public int getAccountId() {
		return accountId;
	}

	public String getHolderName() {
		return holderName;
	}

	public double getBalance() {
		return balance;
	}
}
