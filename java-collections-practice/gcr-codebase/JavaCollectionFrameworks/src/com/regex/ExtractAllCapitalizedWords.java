/*Extract All Capitalized Words from a Sentence
🔹 Example Text:
"The Eiffel Tower is in Paris and the Statue of Liberty is in New York."
🔹 Expected Output:
Eiffel, Tower, Paris, Statue, Liberty, New, York
*/

package com.regex;

import java.util.regex.*;
import java.util.Scanner;

public class ExtractAllCapitalizedWords {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		String regex = "\\b[A-Z][a-z]*\\b";

		Pattern pattern = Pattern.compile(regex);

		System.out.print("Enter a sentence: ");
		String sentence = input.nextLine();

		Matcher matcher = pattern.matcher(sentence);

		while (matcher.find()) {
			System.out.print(matcher.group() + ", ");
		}
	}
}
