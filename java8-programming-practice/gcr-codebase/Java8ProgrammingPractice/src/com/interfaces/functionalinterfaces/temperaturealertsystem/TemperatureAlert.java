package com.interfaces.functionalinterfaces.temperaturealertsystem;

import java.util.function.Predicate;

class TemperatureAlert {
	static boolean checkTemperature(double temperature, Predicate<Double> condition) {
		return condition.test(temperature);
	}
}
