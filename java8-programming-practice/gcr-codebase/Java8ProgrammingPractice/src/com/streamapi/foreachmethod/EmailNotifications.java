/*Email Notifications
Given a list of user emails, use forEach() to send a notification email to each user.*/

package com.streamapi.foreachmethod;

import java.util.*;

public class EmailNotifications {
	private static void sendEmailNotification(String email) {
		System.out.println("Notification sent to: " + email);
	}

	private static void notifyUsers(List<String> emails) {
		emails.forEach(email -> sendEmailNotification(email));
	}

	public static void main(String[] args) {
		List<String> emails = Arrays.asList("devika@gmail.com", "annu@gmail.com", "satya@gmail.com");
		notifyUsers(emails);
	}
}
