/* Extract All Email Addresses from a Text
🔹 Example Text:
"Contact us at support@example.com and info@company.org"
🔹 Expected Output:
support@example.com
info@company.org*/

package com.regex;

import java.util.regex.*;
import java.util.Scanner;

public class ExtractAllEmailAddresses {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		String regex = "[a-zA-Z0-9]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

		Pattern pattern = Pattern.compile(regex);

		System.out.println("Enter the text(should contain emails): ");
		String text = input.nextLine();

		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
			System.out.println(matcher.group());
		}

	}
}
