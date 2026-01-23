/*Problem Statement:
Create a custom exception called InvalidAgeException.
Write a method validateAge(int age) that throws InvalidAgeException if the age is below 18.
In main(), take user input and call validateAge().
If an exception occurs, display "Age must be 18 or above".
*/

package com.exceptionalhandling.customexception;

import java.util.Scanner;

public class CustomException {

	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or above");
		}
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Enter your age: ");
			int age = input.nextInt();

			validateAge(age);
			System.out.println("Access granted!");
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}
