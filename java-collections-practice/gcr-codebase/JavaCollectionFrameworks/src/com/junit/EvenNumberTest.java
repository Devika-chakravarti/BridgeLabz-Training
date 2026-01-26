/*Testing Parameterized Tests
Problem:
Create a method isEven(int number) that returns true if a number is even.
Use @ParameterizedTest to test this method with multiple values like 2, 4, 6, 7, 9.
*/

package com.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenNumberTest {

	// method to check if number is even
	boolean isEven(int number) {
		return number % 2 == 0;
	}

	@ParameterizedTest
	@ValueSource(ints = { 2, 4, 6, 7, 9 })
	void testIsEven(int number) {

		// if number is even then result should be true
		if (number % 2 == 0) {
			assertTrue(isEven(number));
		}
		// if number is odd then result should be false
		else {
			assertFalse(isEven(number));
		}
	}
}
