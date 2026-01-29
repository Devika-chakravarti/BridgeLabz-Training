/* Testing String Utility Methods
Problem:
Create a StringUtils class with the following methods:
reverse(String str): Returns the reverse of a given string.
isPalindrome(String str): Returns true if the string is a palindrome.
toUpperCase(String str): Converts a string to uppercase.
Write JUnit test cases to verify that these methods work correctly.
*/

package com.junit.com;

public class StringUtils {

	public String reverse(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed = reversed + str.charAt(i);
		}
		return reversed;
	}

	public boolean isPalindrome(String str) {
		String reversed = reverse(str);
		return str.equals(reversed);
	}

	public String toUpperCase(String str) {
		return str.toUpperCase();
	}
}
