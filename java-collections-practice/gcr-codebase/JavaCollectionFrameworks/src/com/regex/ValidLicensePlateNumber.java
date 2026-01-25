/*Validate a License Plate Number
License plate format: Starts with two uppercase letters, followed by four digits.
Example: "AB1234" is valid, but "A12345" is invalid.
*/

package com.regex;

import java.util.regex.*;
import java.util.Scanner;

public class ValidLicensePlateNumber {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		String regex = "^[A-Z]{2}[0-9]{4}$";

		Pattern pattern = Pattern.compile(regex);

		System.out.print("Enter license plate number: ");
		String licenseNumber = input.nextLine();

		Matcher matcher = pattern.matcher(licenseNumber);

		if (matcher.matches()) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
	}
}
