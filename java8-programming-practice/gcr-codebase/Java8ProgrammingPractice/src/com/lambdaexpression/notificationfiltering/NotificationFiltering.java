/*Notification Filtering
○ Scenario: A hospital app sends patient alerts. Based on user preference, only
certain alerts should be shown.
○ Task: Use lambdas with Predicate to filter alerts.*/

package com.lambdaexpression.notificationfiltering;

import java.util.*;
import java.util.function.Predicate;

public class NotificationFiltering {
	static class Alert {
		String message;
		String type;

		Alert(String message, String type) {
			this.message = message;
			this.type = type;
		}

		public String toString() {
			return type + " : " + message;
		}
	}

	public static void main(String[] args) {
		List<Alert> alerts = Arrays.asList(new Alert("Heart rate critical", "EMERGENCY"),
				new Alert("Take blood pressure medicine", "MEDICATION"), new Alert("Appointment reminder", "GENERAL"));

		Predicate<Alert> emergencyOnly = alert -> "EMERGENCY".equals(alert.type);
		Predicate<Alert> medicationOnly = alert -> "MEDICATION".equals(alert.type);

		filterAlerts(alerts, emergencyOnly);
		filterAlerts(alerts, medicationOnly);
	}

	private static void filterAlerts(List<Alert> alerts, Predicate<Alert> condition) {
		// filter alerts based on user preference
		alerts.stream().filter(condition).forEach(System.out::println);
	}
}
