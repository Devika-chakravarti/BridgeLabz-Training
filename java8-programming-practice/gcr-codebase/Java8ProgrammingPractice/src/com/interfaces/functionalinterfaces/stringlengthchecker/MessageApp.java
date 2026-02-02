/*String Length Checker
○ Scenario: Check if a message exceeds character limit.
○ Task: Use Function<String, Integer>.*/

package com.interfaces.functionalinterfaces.stringlengthchecker;

import java.util.function.Function;

public class MessageApp {
	public static void main(String[] args) {

		String message = "Java 8 functional interfaces are easy";

		Function<String, Integer> lengthFunction = msg -> msg.length();

		int maxLimit = 30;

		if (MessageValidator.isLimitExceeded(message, lengthFunction, maxLimit)) {
			System.out.println("Message exceeds character limit");
		} else {
			System.out.println("Message is within limit");
		}
	}
}
