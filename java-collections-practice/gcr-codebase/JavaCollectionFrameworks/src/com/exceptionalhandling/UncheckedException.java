/*Problem Statement:
Write a Java program that asks the user to enter two numbers and divides them. Handle possible exceptions such as:
ArithmeticException if division by zero occurs.
InputMismatchException if the user enters a non-numeric value.
*/

package com.exceptionalhandling;

import java.util.Scanner;
import java.util.InputMismatchException;

public class UncheckedException {
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
			System.out.println("Error: Divison by zero is not allowed");
		} catch (InputMismatchException e) {
			System.out.println("Error: Entered invalid value");
		}
	}
}
