/*Testing Password Strength Validator
📌 Problem:
Create a PasswordValidator class with:
Password must have at least 8 characters, one uppercase letter, and one digit.
✅ Write JUnit tests for valid and invalid passwords.
*/

package com.junit.com;

public class PasswordValidator {
	public boolean isValid(String password) {
		if (password == null || password.length() < 8) {
			return false;
		}

		boolean hasUppercase = false;
		boolean hasDigit = false;

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
