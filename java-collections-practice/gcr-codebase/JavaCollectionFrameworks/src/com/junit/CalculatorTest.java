/*Basic JUnit Test: Testing a Calculator Class
Problem:
Create a Calculator class with methods add(int a, int b), subtract(int a, int b), multiply(int a, int b), and divide(int a, int b). Write JUnit test cases for each method.
👉 Bonus: Test for division by zero and handle exceptions properly.
*/

package com.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	// Calculator logic written inside the same file
	class Calculator {

		// adds two numbers
		int add(int a, int b) {
			return a + b;
		}

		// subtracts two numbers
		int subtract(int a, int b) {
			return a - b;
		}

		// multiplies two numbers
		int multiply(int a, int b) {
			return a * b;
		}

		// divides two numbers
		int divide(int a, int b) {
			if (b == 0) {
				throw new ArithmeticException("Cannot divide by zero");
			}
			return a / b;
		}
	}

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
		try {
			calculator.divide(10, 0);
			fail("Exception should be thrown");
		} catch (ArithmeticException e) {
			assertEquals("Cannot divide by zero", e.getMessage());
		}
	}
}
