/*Problem Statement:
Develop a Bank Account System where:
withdraw(double amount) method:
Throws InsufficientBalanceException if withdrawal amount exceeds balance.
Throws IllegalArgumentException if the amount is negative.
Handle exceptions in main().
*/

package com.exceptionalhandling.banktransactionsystem;

import java.util.Scanner;

public class BankAccountSystem {

	static double bankBalance = 100000;
	
	public static void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
		if (amount > bankBalance) {
			throw new InsufficientBalanceException("Insufficient balance!");
		}
		else if (amount < 0) {
			throw new IllegalArgumentException("Invalid amount!");
		}
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Enter the amount you want to withdraw: ");
			double amount = input.nextDouble();
			double currentBalance = bankBalance - amount;

			withdraw(amount);
			System.out.println("Withdrawal successful, new balance: " + currentBalance);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
