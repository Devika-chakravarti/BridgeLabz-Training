/*Validate a Hex Color Code
A valid hex color:
Starts with a #
Followed by 6 hexadecimal characters (0-9, A-F, a-f).
🔹 Example Inputs & Outputs
✅ "#FFA500" → Valid
✅ "#ff4500" → Valid
❌ "#123" → Invalid (too short)
*/

package com.regex;

import java.util.regex.*;
import java.util.Scanner;

public class ValidHexColorCode {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		String regex = "^#[0-9A-Fa-f]{6}$";

		Pattern pattern = Pattern.compile(regex);

		System.out.print("Enter the hex color code: ");
		String hexCode = input.next();

		Matcher matcher = pattern.matcher(hexCode);

		if (matcher.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}
}
