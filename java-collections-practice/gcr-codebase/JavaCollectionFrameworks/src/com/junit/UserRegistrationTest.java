/*Testing User Registration
📌 Problem:
Create a UserRegistration class with:
registerUser(String username, String email, String password).
Throws IllegalArgumentException for invalid inputs.
✅ Write JUnit tests to verify valid and invalid user registrations.
*/

package com.junit;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

	private UserRegistration userReg;

	@BeforeEach
	void setUp() {
		userReg = new UserRegistration();
	}

	@Test
	void testValidRegistration() {
		try {
			userReg.registerUser("Devika", "devika@example.com", "Password1");
		} catch (IllegalArgumentException e) {
			fail("Exception should not be thrown for valid input");
		}
	}

	@Test
	void testInvalidUsername() {
		try {
			userReg.registerUser("", "test@example.com", "Password1");
			fail("Expected IllegalArgumentException for empty username");
		} catch (IllegalArgumentException e) {
			// Exception caught, test passes
		}
	}

	@Test
	void testInvalidEmail() {
		try {
			userReg.registerUser("Devika", "invalid-email", "Password1");
			fail("Expected IllegalArgumentException for invalid email");
		} catch (IllegalArgumentException e) {
			// Exception caught, test passes
		}
	}

	@Test
	void testInvalidPassword() {
		try {
			userReg.registerUser("Devika", "devika@example.com", "pass");
			fail("Expected IllegalArgumentException for weak password");
		} catch (IllegalArgumentException e) {
			// Exception caught, test passes
		}
	}
}

// UserRegistration class (simple version for testing)
class UserRegistration {
	public void registerUser(String username, String email, String password) {
		if (username == null || username.isEmpty()) {
			throw new IllegalArgumentException("Username is invalid");
		}
		if (email == null || !email.contains("@")) {
			throw new IllegalArgumentException("Email is invalid");
		}
		if (password == null || password.length() < 8 || !password.matches(".*[A-Z].*")
				|| !password.matches(".*\\d.*")) {
			throw new IllegalArgumentException("Password is weak");
		}
	}
}
