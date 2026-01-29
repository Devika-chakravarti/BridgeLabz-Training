package com.junit.test;

import org.junit.jupiter.api.Test;
import com.junit.com.TemperatureConverter;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {
	private TemperatureConverter converter = new TemperatureConverter();

	@Test
	void testCelsiusToFahrenheit() {
		assertEquals(32, converter.celsiusToFahrenheit(0), "0°C should be 32°F");
		assertEquals(212, converter.celsiusToFahrenheit(100), "100°C should be 212°F");
	}

	@Test
	void testFahrenheitToCelsius() {
		assertEquals(0, converter.fahrenheitToCelsius(32), "32°F should be 0°C");
		assertEquals(100, converter.fahrenheitToCelsius(212), "212°F should be 100°C");
	}
}
