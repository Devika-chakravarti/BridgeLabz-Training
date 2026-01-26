/*Access Private Field: Create a class Person with a private field age. Use Reflection to modify and retrieve its value.*/

package com.reflection.accessprivatemethod;

import java.lang.reflect.Field;

public class AccessPrivateFieldReflection {

	public static void main(String[] args) throws Exception {

		Person person = new Person(25);

		// Get Class object
		Class<?> cls = person.getClass();

		// Access private field
		Field ageField = cls.getDeclaredField("age");
		ageField.setAccessible(true);

		// Retrieve and print original value
		int originalAge = (int) ageField.get(person);
		System.out.println("Original age: " + originalAge);

		ageField.set(person, 30);

		// Retrieve and print modified value
		int modifiedAge = (int) ageField.get(person);
		System.out.println("Modified age: " + modifiedAge);
	}
}
