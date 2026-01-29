package com.junit.test;

import com.junit.com.UserRegistration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserRegistrationTest {

	private UserRegistration userReg;

	@BeforeEach
	void setUp() {
		userReg = new UserRegistration();
	}

	@Test
	void testValidRegistration() {
		userReg.registerUser("Devika", "devika@example.com", "Password1");
	}

	@Test
	void testInvalidUsername() {

		assertThrows(IllegalArgumentException.class, () -> {
			userReg.registerUser("", "test@example.com", "Password1");
		});
	}

	@Test
	void testInvalidEmail() {

		assertThrows(IllegalArgumentException.class, () -> {
			userReg.registerUser("Devika", "invalid-email", "Password1");
		});
	}

	@Test
	void testInvalidPassword() {

		assertThrows(IllegalArgumentException.class, () -> {
			userReg.registerUser("Devika", "devika@example.com", "pass");
		});
	}
}
