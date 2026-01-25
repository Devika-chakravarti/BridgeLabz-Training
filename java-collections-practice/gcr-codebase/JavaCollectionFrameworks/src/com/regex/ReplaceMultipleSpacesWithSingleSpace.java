/*Replace Multiple Spaces with a Single Space
🔹 Example Input:
"This is an example with multiple spaces."
🔹 Expected Output:
"This is an example with multiple spaces."
*/

package com.regex;

import java.util.Scanner;

public class ReplaceMultipleSpacesWithSingleSpace {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		String sentence = input.nextLine();

		String result = sentence.replaceAll("\\s+", " ");
		System.out.println(result);
	}
}
