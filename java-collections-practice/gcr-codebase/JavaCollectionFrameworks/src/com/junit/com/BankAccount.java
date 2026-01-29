/*Testing Banking Transactions
📌 Problem:
Create a BankAccount class with:
deposit(double amount): Adds money to the balance.
withdraw(double amount): Reduces balance.
getBalance(): Returns the current balance.
✅ Write JUnit tests to check correct balance updates.
✅ Ensure withdrawals fail if funds are insufficient.*/

package com.junit.com;

public class BankAccount {

	private double balance = 0;

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {

		if (amount > balance) {
			throw new IllegalArgumentException("Insufficient balance");
		}

		balance = balance - amount;
	}

	public double getBalance() {
		return balance;
	}
}
