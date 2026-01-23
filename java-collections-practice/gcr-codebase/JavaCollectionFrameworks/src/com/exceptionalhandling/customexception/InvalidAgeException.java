package com.exceptionalhandling.customexception;

public class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}
