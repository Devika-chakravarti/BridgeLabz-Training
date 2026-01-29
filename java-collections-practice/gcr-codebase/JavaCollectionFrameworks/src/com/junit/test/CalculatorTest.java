package com.junit.test;

import com.junit.com.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

	Calculator calculator = new Calculator();

	@Test
	void testAdd() {
		int result = calculator.add(10, 5);
		assertEquals(15, result);
	}

	@Test
	void testSubtract() {
		int result = calculator.subtract(10, 5);
		assertEquals(5, result);
	}

	@Test
	void testMultiply() {
		int result = calculator.multiply(4, 5);
		assertEquals(20, result);
	}

	@Test
	void testDivide() {
		int result = calculator.divide(10, 2);
		assertEquals(5, result);
	}

	@Test
	void testDivideByZero() {
		ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
			calculator.divide(10, 0);
		});

		assertEquals("Cannot divide by zero", exception.getMessage());
	}
}
