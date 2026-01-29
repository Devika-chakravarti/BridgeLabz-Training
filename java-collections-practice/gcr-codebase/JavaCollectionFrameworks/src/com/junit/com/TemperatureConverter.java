/*Testing Temperature Converter
📌 Problem:
Create a TemperatureConverter class with:
celsiusToFahrenheit(double celsius): Converts Celsius to Fahrenheit.
fahrenheitToCelsius(double fahrenheit): Converts Fahrenheit to Celsius.
✅ Write JUnit tests to validate conversions.
*/

package com.junit.com;

public class TemperatureConverter {
	public double celsiusToFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}

	public double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}
}
