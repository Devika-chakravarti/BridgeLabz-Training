package com.annotation.customannotations.jsonfield;

public class User {

	@JsonField(name = "user_name")
	private String username;

	@JsonField(name = "user_email")
	private String email;

	private int age;

	public User(String username, String email, int age) {
		this.username = username;
		this.email = email;
		this.age = age;
	}

	// Getters
	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}
}
