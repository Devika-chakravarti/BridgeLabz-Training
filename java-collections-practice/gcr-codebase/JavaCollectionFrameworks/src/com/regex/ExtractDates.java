/* Extract Dates in dd/mm/yyyy Format
🔹 Example Text:
"The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020."
🔹 Expected Output:
12/05/2023, 15/08/2024, 29/02/2020
*/

package com.regex;

import java.util.regex.*;
import java.util.Scanner;

public class ExtractDates {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

		Pattern pattern = Pattern.compile(regex);

		System.out.print("Enter a text(which includes dates in dd/mm/yyyy format): ");
		String text = input.nextLine();

		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
			System.out.print(matcher.group() + ", ");
		}
	}
}
