/*Extract Currency Values from a Text
🔹 Example Text:
"The price is $45.99, and the discount is 10.50."
🔹 Expected Output:
$45.99, 10.50
*/

package com.regex;

import java.util.regex.*;
import java.util.Scanner;

public class ExtractCurrencyValues {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		String regex = "\\$?\\d+\\.\\d{2}";

		Pattern pattern = Pattern.compile(regex);

		System.out.print("Enter a text: ");
		String text = input.nextLine();

		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
			System.out.println(matcher.group() + ", ");
		}
	}
}
