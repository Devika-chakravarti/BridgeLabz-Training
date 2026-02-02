/*Temperature Alert System
○ Scenario: Alert if temperature crosses threshold.
○ Task: Use Predicate<Double> functional interface.*/

package com.interfaces.functionalinterfaces.temperaturealertsystem;

import java.util.function.Predicate;

public class TemperatureApp {
	public static void main(String[] args) {

		double currentTemperature = 42.5;

		Predicate<Double> highTemperature = temp -> temp > 40;

		if (TemperatureAlert.checkTemperature(currentTemperature, highTemperature)) {
			System.out.println("Alert: High temperature detected");
		} else {
			System.out.println("Temperature is normal");
		}
	}
}
