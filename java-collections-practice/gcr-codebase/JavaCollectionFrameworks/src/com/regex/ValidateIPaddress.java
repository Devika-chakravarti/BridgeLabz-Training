/*Validate an IP Address
A valid IPv4 address consists of four groups of numbers (0-255) separated by dots.
*/

package com.regex;

import java.util.regex.*;
import java.util.Scanner;

public class ValidateIPaddress {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		/* ^ start
		 * 25[0-5] matches numbers 250-255
		 * 2[0-4]\d matches numbers 200-249
		 * 1/d/d matches numbers 100-199
		 * [1-9]?\d matches numbers 0-99
		 * (...) groupd (0-255)
		 * \. matches .
		 * {3} first 3 number groups must be followed the .
		 * Last (25[0-5]|...[1-9]?\d) fourth number group
		 * $ end
		 * */
		String regex = "^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";

		Pattern pattern = Pattern.compile(regex);

		System.out.print("Enter IPv4 address: ");
		String ipv4 = input.nextLine();

		Matcher matcher = pattern.matcher(ipv4);

		if (matcher.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}
}
