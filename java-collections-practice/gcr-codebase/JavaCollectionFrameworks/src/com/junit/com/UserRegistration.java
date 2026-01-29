/*Testing User Registration
📌 Problem:
Create a UserRegistration class with:
registerUser(String username, String email, String password).
Throws IllegalArgumentException for invalid inputs.
✅ Write JUnit tests to verify valid and invalid user registrations.
*/

package com.junit.com;

public class UserRegistration {

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
