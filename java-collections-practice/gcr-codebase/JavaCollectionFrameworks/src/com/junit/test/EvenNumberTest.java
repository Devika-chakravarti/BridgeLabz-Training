package com.junit.test;

import com.junit.com.EvenNumber;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenNumberTest {

	private EvenNumber evenNumber = new EvenNumber();

	@ParameterizedTest
	@ValueSource(ints = { 2, 4, 6, 7, 9 })
	void testIsEven(int number) {

		if (number % 2 == 0) {
			assertTrue(evenNumber.isEven(number));
		} else {
			assertFalse(evenNumber.isEven(number));
		}
	}
}
