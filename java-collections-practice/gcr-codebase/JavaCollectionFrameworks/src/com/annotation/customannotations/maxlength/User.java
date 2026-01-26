package com.annotation.customannotations.maxlength;

import java.lang.reflect.Field;

public class User {

	@MaxLength(10)
	private String username;

	public User(String username) {
		this.username = username;

		// Validate fields annotated with @MaxLength
		for (Field field : this.getClass().getDeclaredFields()) {

			if (field.isAnnotationPresent(MaxLength.class)) {

				MaxLength maxLength = field.getAnnotation(MaxLength.class);

				try {
					field.setAccessible(true);
					String value = (String) field.get(this);

					if (value.length() > maxLength.value()) {
						throw new IllegalArgumentException(
								"Field '" + field.getName() + "' exceeds max length of " + maxLength.value());
					}

				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public String getUsername() {
		return username;
	}

	public static void main(String[] args) {

		// Valid username
		User user1 = new User("Devika123");
		System.out.println("Username: " + user1.getUsername());

		// Invalid username (exceeds max length)
		try {
			User user2 = new User("VeryLongUsername123");
		} catch (IllegalArgumentException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
