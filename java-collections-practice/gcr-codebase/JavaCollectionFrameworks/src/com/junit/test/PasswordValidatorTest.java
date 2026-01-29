package com.junit.test;

import org.junit.jupiter.api.Test;
import com.junit.com.PasswordValidator;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest {

	private PasswordValidator validator = new PasswordValidator();

	@Test
	void testValidPassword() {
		assertTrue(validator.isValid("Password1"));
	}

	@Test
	void testShortPassword() {
		assertFalse(validator.isValid("Pass1"));
	}

	@Test
	void testPasswordWithoutUppercase() {
		assertFalse(validator.isValid("password1"));
	}

	@Test
	void testPasswordWithoutDigit() {
		assertFalse(validator.isValid("Password"));
	}
}
