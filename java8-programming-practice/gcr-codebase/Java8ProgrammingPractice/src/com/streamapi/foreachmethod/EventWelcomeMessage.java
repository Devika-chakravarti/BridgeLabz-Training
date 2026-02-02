/*Event Attendee Welcome Message
○ Scenario: Print a welcome message for all attendees.
○ Task: Use forEach() with a lambda.*/

package com.streamapi.foreachmethod;

import java.util.*;

public class EventWelcomeMessage {
	private static void printWelcomeMessages(List<String> attendees) {
		attendees.forEach(attendee -> System.out.println("Welcome to the event, " + attendee + "!"));
	}

	public static void main(String[] args) {
		List<String> attendees = Arrays.asList("Devika", "Annu", "Satya", "Siya");
		printWelcomeMessages(attendees);
	}
}
