package com.junit.test;

import com.junit.com.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

	BankAccount account;

	@BeforeEach
	void setUp() {
		account = new BankAccount();
	}

	@Test
	void testDeposit() {
		account.deposit(1000);
		assertEquals(1000, account.getBalance());
	}

	@Test
	void testWithdraw() {
		account.deposit(1000);
		account.withdraw(400);
		assertEquals(600, account.getBalance());
	}

	@Test
	void testWithdrawInsufficientBalance() {
		account.deposit(300);
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			account.withdraw(500);
		});
		assertEquals("Insufficient balance", exception.getMessage());
	}
}
