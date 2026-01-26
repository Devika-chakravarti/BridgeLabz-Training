/* Testing String Utility Methods
Problem:
Create a StringUtils class with the following methods:
reverse(String str): Returns the reverse of a given string.
isPalindrome(String str): Returns true if the string is a palindrome.
toUpperCase(String str): Converts a string to uppercase.
Write JUnit test cases to verify that these methods work correctly.
*/

package com.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

	// String utility logic inside same file
	class StringUtils {

		// reverses the given string
		String reverse(String str) {
			String reversed = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				reversed = reversed + str.charAt(i);
			}
			return reversed;
		}

		// checks whether string is palindrome
		boolean isPalindrome(String str) {
			String reversed = reverse(str);
			return str.equals(reversed);
		}

		// converts string to uppercase
		String toUpperCase(String str) {
			return str.toUpperCase();
		}
	}

	StringUtils utils = new StringUtils();

	@Test
	void testReverse() {
		String result = utils.reverse("java");
		assertEquals("avaj", result);
	}

	@Test
	void testPalindromeTrue() {
		boolean result = utils.isPalindrome("madam");
		assertTrue(result);
	}

	@Test
	void testPalindromeFalse() {
		boolean result = utils.isPalindrome("hello");
		assertFalse(result);
	}

	@Test
	void testToUpperCase() {
		String result = utils.toUpperCase("junit");
		assertEquals("JUNIT", result);
	}
}
