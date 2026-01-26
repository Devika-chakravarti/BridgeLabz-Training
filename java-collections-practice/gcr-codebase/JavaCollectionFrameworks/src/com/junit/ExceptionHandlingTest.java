/*Testing Exception Handling
Problem:
Create a method divide(int a, int b) that throws an ArithmeticException if b is zero. Write a JUnit test to verify that the exception is thrown properly.
*/

package com.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExceptionHandlingTest {

	// Method to divide two numbers
	int divide(int a, int b) {
		return a / b;
	}

	@Test
	void testDivideByZero() {
		try {
			divide(10, 0);
			fail("ArithmeticException was expected");

		} catch (ArithmeticException e) {
			assertTrue(true);
		}
	}

	@Test
	void testDivideNormally() {
		int result = divide(10, 2);

		// checking correct division result
		assertEquals(5, result);
	}
}
