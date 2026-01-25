/*Find Repeating Words in a Sentence
🔹 Example Input:
"This is is a repeated repeated word test."
🔹 Expected Output:
is, repeated
*/

package com.regex;

import java.util.regex.*;
import java.util.Scanner;

public class FindRepeatingWords {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		String regex = "\\b(\\w+)\\b\\s+\\1\\b";

		Pattern pattern = Pattern.compile(regex);

		System.out.print("Enter a sentence: ");
		String sentence = input.nextLine();

		Matcher matcher = pattern.matcher(sentence);

		while (matcher.find()) {
			System.out.println(matcher.group(1) + ", ");
		}
	}
}
