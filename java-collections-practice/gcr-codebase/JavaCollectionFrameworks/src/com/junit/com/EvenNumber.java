/*Testing Parameterized Tests
Problem:
Create a method isEven(int number) that returns true if a number is even.
Use @ParameterizedTest to test this method with multiple values like 2, 4, 6, 7, 9.
*/

package com.junit.com;

public class EvenNumber {
	public boolean isEven(int number) {
		return number % 2 == 0;
	}
}
