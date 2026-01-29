package com.junit.test;

import org.junit.jupiter.api.Test;
import com.junit.com.StringUtils;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

	private StringUtils utils = new StringUtils();

	@Test
	void testReverse() {
		assertEquals("avaj", utils.reverse("java"));
	}

	@Test
	void testPalindromeTrue() {
		assertTrue(utils.isPalindrome("madam"));
	}

	@Test
	void testPalindromeFalse() {
		assertFalse(utils.isPalindrome("hello"));
	}

	@Test
	void testToUpperCase() {
		assertEquals("JUNIT", utils.toUpperCase("junit"));
	}
}
