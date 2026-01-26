/*Testing Date Formatter
📌 Problem:
Create a DateFormatter class with:
formatDate(String inputDate): Converts yyyy-MM-dd format to dd-MM-yyyy.
✅ Write JUnit test cases for valid and invalid dates.
*/

package com.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateFormatterTest {

	@Test
	void testFormatDate_ValidDate() {
		DateFormatter formatter = new DateFormatter();

		// Valid date
		String result = formatter.formatDate("2026-01-25");
		assertEquals("25-01-2026", result, "Date should be converted to dd-MM-yyyy format");

		result = formatter.formatDate("1999-12-31");
		assertEquals("31-12-1999", result, "Date should be converted correctly");
	}

	@Test
	void testFormatDate_InvalidDate() {
		DateFormatter formatter = new DateFormatter();

		// Invalid dates should return null
		String result = formatter.formatDate("2026/01/25");
		assertNull(result, "Invalid format should return null");

		result = formatter.formatDate("25-01-2026");
		assertNull(result, "Wrong input format should return null");

		result = formatter.formatDate("invalid-date");
		assertNull(result, "Non-date string should return null");
	}
}

class DateFormatter {

	// Converts yyyy-MM-dd to dd-MM-yyyy
	String formatDate(String inputDate) {
		if (inputDate == null)
			return null;

		String[] parts = inputDate.split("-");

		if (parts.length != 3)
			return null;

		String year = parts[0];
		String month = parts[1];
		String day = parts[2];

		// Basic validation simply year, month, day should be numbers
		if (!year.matches("\\d{4}") || !month.matches("\\d{2}") || !day.matches("\\d{2}")) {
			return null;
		}

		return day + "-" + month + "-" + year;
	}
}
