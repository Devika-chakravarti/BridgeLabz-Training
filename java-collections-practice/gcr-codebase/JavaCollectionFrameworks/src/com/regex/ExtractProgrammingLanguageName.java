/*Extract Programming Language Names from a Text
🔹 Example Text:
"I love Java, Python, and JavaScript, but I haven't tried Go yet."
🔹 Expected Output:
Java, Python, JavaScript, Go
*/

package com.regex;

import java.util.regex.*;
import java.util.Scanner;

public class ExtractProgrammingLanguageName {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		String regex = "\\b(Java|Python|JavaScript|Go)\\b";

		Pattern pattern = Pattern.compile(regex);

		System.out.print("Enter a text: ");
		String text = input.nextLine();

		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
			System.out.println(matcher.group() + ",");
		}
	}
}
