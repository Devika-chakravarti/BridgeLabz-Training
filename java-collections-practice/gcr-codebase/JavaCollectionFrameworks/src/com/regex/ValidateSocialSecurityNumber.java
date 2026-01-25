/*Validate a Social Security Number (SSN)
🔹 Example Input:
"My SSN is 123-45-6789."
🔹 Expected Output:
✅ "123-45-6789" is valid
❌ "123456789" is invalid
*/

package com.regex;

import java.util.regex.*;
import java.util.Scanner;

public class ValidateSocialSecurityNumber {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		String regex = "^[0-9]{3}-[0-9]{2}-[0-9]{4}$";

		Pattern pattern = Pattern.compile(regex);

		System.out.print("My SSN is ");
		String socialSecurityNumber = input.nextLine();

		Matcher matcher = pattern.matcher(socialSecurityNumber);

		if (matcher.matches()) {
			System.out.println(socialSecurityNumber + " is valid");
		} else {
			System.out.println(socialSecurityNumber + " is invalid");
		}
	}
}
