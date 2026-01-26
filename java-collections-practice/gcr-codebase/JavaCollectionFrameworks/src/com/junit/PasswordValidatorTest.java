/*Testing Password Strength Validator
📌 Problem:
Create a PasswordValidator class with:
Password must have at least 8 characters, one uppercase letter, and one digit.
✅ Write JUnit tests for valid and invalid passwords.
*/

package com.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

	@Test
	void testValidPassword() {

		PasswordValidator validator = new PasswordValidator();
		boolean result = validator.isValid("Password1");

		assertTrue(result);
	}

	@Test
	void testShortPassword() {

		PasswordValidator validator = new PasswordValidator();
		boolean result = validator.isValid("Pass1");

		assertFalse(result);
	}

	@Test
	void testPasswordWithoutUppercase() {

		PasswordValidator validator = new PasswordValidator();
		boolean result = validator.isValid("password1");

		assertFalse(result);
	}

	@Test
	void testPasswordWithoutDigit() {

		PasswordValidator validator = new PasswordValidator();
		boolean result = validator.isValid("Password");

		assertFalse(result);
	}
}

class PasswordValidator {

	// checks whether password follows all rules
	boolean isValid(String password) {

		if (password.length() < 8) {
			return false;
		}

		boolean hasUppercase = false;
		boolean hasDigit = false;

		// checking each character
		for (int i = 0; i < password.length(); i++) {

			char ch = password.charAt(i);

			if (Character.isUpperCase(ch)) {
				hasUppercase = true;
			}

			if (Character.isDigit(ch)) {
				hasDigit = true;
			}
		}

		return hasUppercase && hasDigit;
	}
}
