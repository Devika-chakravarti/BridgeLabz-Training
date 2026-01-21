/*Word Frequency Counter
Read a text file and count the frequency of each word using a HashMap. Ignore case and punctuation.
Example:
Input: "Hello world, hello Java!" → Output: {hello=2, world=1, java=1}
*/

package com.collections.map;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class WordFrequencyCounter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter text: ");
		String text = input.nextLine().toLowerCase();

		Map<String, Integer> freqMap = new HashMap<>();

		String word = "";

		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);

			// checking text should contain only character or digit not any other symbol
			if (Character.isLetterOrDigit(ch)) {
				word += ch;
			} else {
				if (!word.isEmpty()) {
					freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
					word = "";
				}
			}
		}
		if (!word.isEmpty()) {
			freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
		}
		System.out.println("Word frequencies: " + freqMap);
	}
}
