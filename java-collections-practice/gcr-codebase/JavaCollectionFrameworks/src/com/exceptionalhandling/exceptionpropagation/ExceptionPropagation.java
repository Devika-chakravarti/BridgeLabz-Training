/*Problem Statement:
Create a method calculateInterest(double amount, double rate, int years) that:
Throws IllegalArgumentException if amount or rate is negative.
Propagates the exception using throws and handles it in main().
*/
package com.exceptionalhandling.exceptionpropagation;

import java.util.Scanner;

public class ExceptionPropagation {

	public static void calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
		if (amount < 0 || rate < 0) {
			throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
		}
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Enter the amount: ");
			double amount = input.nextDouble();
			System.out.print("Enter the rate: ");
			double rate = input.nextDouble();
			System.out.print("Enter the time: ");
			int years = input.nextInt();

			calculateInterest(amount, rate, years);
			double interest = (amount * rate * years) / 100;
			System.out.print("Interest: " + interest);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
