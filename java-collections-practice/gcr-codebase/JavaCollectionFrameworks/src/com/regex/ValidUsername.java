/*Validate a Username
A valid username:
Can only contain letters (a-z, A-Z), numbers (0-9), and underscores (_)
Must start with a letter
Must be between 5 to 15 characters long
🔹 Example Inputs & Outputs
✅ "user_123" → Valid
❌ "123user" → Invalid (starts with a number)
❌ "us" → Invalid (too short)
*/

package com.regex;

import java.util.Scanner;
import java.util.regex.*;

public class ValidUsername {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

		Pattern pattern = Pattern.compile(regex);

		System.out.print("Enter your username: ");
		String username = input.nextLine();

		Matcher matcher = pattern.matcher(username);

		if (matcher.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}
}
