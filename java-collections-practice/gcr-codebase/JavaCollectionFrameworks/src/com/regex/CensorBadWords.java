/*Censor Bad Words in a Sentence
Given a list of bad words, replace them with ****.
🔹 Example Input:
"This is a damn bad example with some stupid words."
🔹 Expected Output:
"This is a **** bad example with some **** words."
*/

package com.regex;

import java.util.regex.*;
import java.util.Scanner;

public class CensorBadWords {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		String regex = "\\b(damn|stupid)\\b";

		Pattern pattern = Pattern.compile(regex);

		System.out.print("Enter a sentence: ");
		String sentence = input.nextLine();

		String censoredSentence = sentence.replaceAll(regex, "****");

		System.out.print("Censored sentence: ");
		System.out.println(censoredSentence);
	}
}
