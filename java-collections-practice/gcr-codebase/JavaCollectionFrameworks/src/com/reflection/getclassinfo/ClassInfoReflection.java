/*Get Class Information: Write a program to accept a class name as input and display its methods, fields, and constructors using Reflection.
*/

package com.reflection.getclassinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassInfoReflection {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Accept class name from user
		System.out.print("Enter fully qualified class name: ");
		String className = input.nextLine();

		try {
			// Load class dynamically
			Class<?> cls = Class.forName(className);

			System.out.println("Class Name: " + cls.getName());

			// Display all fields
			Field[] fields = cls.getDeclaredFields();
			System.out.println("\nFields:");
			for (Field field : fields) {
				System.out.println("  " + field);
			}

			// Display all methods
			Method[] methods = cls.getDeclaredMethods();
			System.out.println("\nMethods:");
			for (Method method : methods) {
				System.out.println("  " + method);
			}

			// Display all constructors
			Constructor<?>[] constructors = cls.getDeclaredConstructors();
			System.out.println("\nConstructors:");
			for (Constructor<?> constructor : constructors) {
				System.out.println("  " + constructor);
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Class not found: " + className);
		}

	}
}
