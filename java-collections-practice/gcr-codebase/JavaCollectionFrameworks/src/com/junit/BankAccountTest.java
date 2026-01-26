/*Testing Banking Transactions
📌 Problem:
Create a BankAccount class with:
deposit(double amount): Adds money to the balance.
withdraw(double amount): Reduces balance.
getBalance(): Returns the current balance.
✅ Write JUnit tests to check correct balance updates.
✅ Ensure withdrawals fail if funds are insufficient.
*/

package com.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

	BankAccount account;

	@BeforeEach
	void setUp() {
		// creating fresh account before each test
		account = new BankAccount();
	}

	@Test
	void testDeposit() {

		account.deposit(1000);

		// checking updated balance
		assertEquals(1000, account.getBalance());
	}

	@Test
	void testWithdraw() {

		account.deposit(1000);
		account.withdraw(400);

		// checking balance after withdrawal
		assertEquals(600, account.getBalance());
	}

	@Test
	void testWithdrawInsufficientBalance() {

		account.deposit(300);

		try {
			account.withdraw(500);
			fail("Withdrawal should fail due to insufficient balance");
		} catch (IllegalArgumentException e) {
			// exception expected
			assertTrue(true);
		}
	}
}

class BankAccount {

	private double balance = 0;

	// adds money to account
	void deposit(double amount) {
		balance = balance + amount;
	}

	// removes money from account
	void withdraw(double amount) {

		if (amount > balance) {
			// throwing exception if balance is not enough
			throw new IllegalArgumentException("Insufficient balance");
		}

		balance = balance - amount;
	}

	// returns current balance
	double getBalance() {
		return balance;
	}
}
