/*Problem Statement:
Write a program that performs integer division and demonstrates the finally block execution.
The program should:
Take two integers from the user.
Perform division.
Handle ArithmeticException (if dividing by zero).
Ensure "Operation completed" is always printed using finally.
*/

package com.exceptionalhandling;

import java.util.Scanner;

public class FinallyBlockExecution {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Enter number1: ");
			int number1 = input.nextInt();

			System.out.print("Enter number2: ");
			int number2 = input.nextInt();

			int result = number1 / number2;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Error: Cannot divide by zero");
		} finally {
			System.out.println("Operation completed");
		}
	}
}
