/*Validate a Credit Card Number (Visa, MasterCard, etc.)
A Visa card number starts with 4 and has 16 digits.
A MasterCard starts with 5 and has 16 digits.
*/

package com.regex;

import java.util.regex.*;
import java.util.Scanner;

public class ValidateCreditCardNumber {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		String regexVisa = "^4[0-9]{15}$";
		String regexMasterCard = "^5[0-9]{15}$";

		Pattern p1 = Pattern.compile(regexVisa);
		Pattern p2 = Pattern.compile(regexMasterCard);

		System.out.print("Enter the Visa card number: ");
		String visa = input.nextLine();

		Matcher m1 = p1.matcher(visa);
		if (m1.matches()) {
			System.out.println("Valid Visa card number");
		} else {
			System.out.println("Invalid Visa card card number");
		}

		System.out.print("Enter the Master card number: ");
		String mastercard = input.nextLine();

		Matcher m2 = p2.matcher(mastercard);
		if (m2.matches()) {
			System.out.println("Valid Mastercard number");
		} else {
			System.out.println("Invalid Mastercard number");
		}
	}
}
