/*Name Uppercasing
○ Scenario: Convert all employee names in uppercase for an HR letter.
○ Task: Use String::toUpperCase in a stream.*/

package com.methodreferences.nameuppercasing;

import java.util.*;

public class NameUppercasing {
	public static void main(String args[]) {
		List<String> employeeNames = Arrays.asList("Devika", "Annu", "Satya");
		employeeNames.stream().map(String::toUpperCase).forEach(System.out::println);
	}
}
