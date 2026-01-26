/*Dynamically Create Objects: Write a program to create an instance of a Student class dynamically using Reflection without using the new keyword.
*/

package com.reflection.dynamicallycreateobjects;

import java.lang.reflect.Constructor;

public class DynamicObjectCreationReflection {

	public static void main(String[] args) throws Exception {

		// Get Class object
		Class<?> cls = Student.class;

		// Access constructor with a String parameter
		Constructor<?> constructor = cls.getConstructor(String.class);

		// Create object dynamically without using 'new'
		Student student = (Student) constructor.newInstance("Emma");

		student.display();
	}
}
