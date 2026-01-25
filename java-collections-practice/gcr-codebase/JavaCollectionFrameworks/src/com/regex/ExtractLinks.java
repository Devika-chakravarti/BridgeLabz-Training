/*Extract Links from a Web Page
🔹 Example Text:
"Visit https://www.google.com and http://example.org for more info."
🔹 Expected Output:
https://www.google.com, http://example.org
*/

package com.regex;

import java.util.regex.*;
import java.util.Scanner;

public class ExtractLinks {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		String regex = "https?://[^\\s]+";

		Pattern pattern = Pattern.compile(regex);

		System.out.print("Enter a text(should include url): ");
		String text = input.nextLine();

		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
			System.out.print(matcher.group() + ", ");
		}
	}
}
