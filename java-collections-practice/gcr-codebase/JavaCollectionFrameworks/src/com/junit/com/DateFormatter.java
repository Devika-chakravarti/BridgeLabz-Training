/*Testing Date Formatter
📌 Problem:
Create a DateFormatter class with:
formatDate(String inputDate): Converts yyyy-MM-dd format to dd-MM-yyyy.
✅ Write JUnit test cases for valid and invalid dates.
*/

package com.junit.com;

public class DateFormatter {

	// Converts yyyy-MM-dd to dd-MM-yyyy
	public String formatDate(String inputDate) {

		if (inputDate == null)
			return null;

		String[] parts = inputDate.split("-");

		if (parts.length != 3)
			return null;

		String year = parts[0];
		String month = parts[1];
		String day = parts[2];

		if (!year.matches("\\d{4}") || !month.matches("\\d{2}") || !day.matches("\\d{2}")) {
			return null;
		}

		return day + "-" + month + "-" + year;
	}
}
