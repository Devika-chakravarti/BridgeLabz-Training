/*Dynamic Method Invocation: Define a class MathOperations with multiple public methods (add, subtract, multiply). Use Reflection to dynamically call any method based on user input.*/

package com.reflection.dynamicmethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvocationReflection {

	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);

		MathOperations mathOps = new MathOperations();

		// Get Class object
		Class<?> cls = mathOps.getClass();

		System.out.print("Enter method name (add, subtract, multiply): ");
		String methodName = input.nextLine();

		System.out.print("Enter first number: ");
		int num1 = input.nextInt();
		System.out.print("Enter second number: ");
		int num2 = input.nextInt();

		try {
			Method method = cls.getMethod(methodName, int.class, int.class);

			int result = (int) method.invoke(mathOps, num1, num2);

			System.out.println("Result: " + result);

		} catch (NoSuchMethodException e) {
			System.out.println("Method not found: " + methodName);
		}

	}
}
