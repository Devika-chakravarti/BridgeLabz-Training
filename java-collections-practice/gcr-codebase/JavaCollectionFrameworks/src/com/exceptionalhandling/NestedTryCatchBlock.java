/*Problem Statement:
Write a Java program that:
Takes an array and a divisor as input.
Tries to access an element at an index.
Tries to divide that element by the divisor.
Uses nested try-catch to handle:
ArrayIndexOutOfBoundsException if the index is invalid.
ArithmeticException if the divisor is zero.
*/

package com.exceptionalhandling;

import java.util.Scanner;

public class NestedTryCatchBlock {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Enter the size of the array: ");
			int size = input.nextInt();
			System.out.println("Enter elements:");
			int[] intArray = new int[size];
			for (int i = 0; i < size; i++) {
				intArray[i] = input.nextInt();
			}
			System.out.print("Enter the index: ");
			int index = input.nextInt();
			System.out.print("Enter the value of divisor: ");
			int divisor = input.nextInt();

			try {
				System.out.println("Element at index " + index + ": " + intArray[index]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid array index!");
			}

			try {
				int result = intArray[index] / divisor;
				System.out.println("Division result: " + result);
			} catch (ArithmeticException e) {
				System.out.println("Cannot divide by zero!");
			}

		} catch (Exception e) {
			System.out.println("General exception caught in outer try block: " + e.getMessage());
		}
	}
}
