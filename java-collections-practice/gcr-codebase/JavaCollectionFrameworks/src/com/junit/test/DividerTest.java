package com.junit.test;

import com.junit.com.Divider;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DividerTest {

	private Divider divider = new Divider();

	@Test
	void testDivideByZero() {

		assertThrows(ArithmeticException.class, () -> {
			divider.divide(10, 0);
		});
	}

	@Test
	void testDivideNormally() {
		int result = divider.divide(10, 2);

		assertEquals(5, result);
	}
}
