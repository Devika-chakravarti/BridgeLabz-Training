package com.junit.test;

import com.junit.com.DateFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DateFormatterTest {

	@Test
	void testFormatDate_ValidDate() {

		DateFormatter formatter = new DateFormatter();

		String result = formatter.formatDate("2026-01-25");
		assertEquals("25-01-2026", result);

		result = formatter.formatDate("1999-12-31");
		assertEquals("31-12-1999", result);
	}

	@Test
	void testFormatDate_InvalidDate() {

		DateFormatter formatter = new DateFormatter();

		String result = formatter.formatDate("2026/01/25");
		assertNull(result);

		result = formatter.formatDate("25-01-2026");
		assertNull(result);

		result = formatter.formatDate("invalid-date");
		assertNull(result);
	}
}
