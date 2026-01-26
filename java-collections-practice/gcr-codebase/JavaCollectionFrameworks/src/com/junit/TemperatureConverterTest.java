/*Testing Temperature Converter
📌 Problem:
Create a TemperatureConverter class with:
celsiusToFahrenheit(double celsius): Converts Celsius to Fahrenheit.
fahrenheitToCelsius(double fahrenheit): Converts Fahrenheit to Celsius.
✅ Write JUnit tests to validate conversions.
*/

package com.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

	@Test
	void testCelsiusToFahrenheit() {

		TemperatureConverter converter = new TemperatureConverter();

		double result = converter.celsiusToFahrenheit(0); // 0°C -> 32°F
		assertEquals(32, result, "0°C should be 32°F");

		result = converter.celsiusToFahrenheit(100); // 100°C -> 212°F
		assertEquals(212, result, "100°C should be 212°F");
	}

	@Test
	void testFahrenheitToCelsius() {

		TemperatureConverter converter = new TemperatureConverter();

		double result = converter.fahrenheitToCelsius(32); // 32°F -> 0°C
		assertEquals(0, result, "32°F should be 0°C");

		result = converter.fahrenheitToCelsius(212); // 212°F -> 100°C
		assertEquals(100, result, "212°F should be 100°C");
	}
}

class TemperatureConverter {

	// Celsius to Fahrenheit
	double celsiusToFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}

	// Fahrenheit to Celsius
	double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}
}
