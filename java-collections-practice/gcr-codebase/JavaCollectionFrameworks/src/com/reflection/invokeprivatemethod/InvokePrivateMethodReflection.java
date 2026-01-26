/*Invoke Private Method: Define a class Calculator with a private method multiply(int a, int b). Use Reflection to invoke this method and display the result.
*/

package com.reflection.invokeprivatemethod;

import java.lang.reflect.Method;

public class InvokePrivateMethodReflection {

	public static void main(String[] args) throws Exception {

		Calculator calculator = new Calculator();

		// Get Class object
		Class<?> cls = calculator.getClass();

		// Access private method
		Method multiplyMethod = cls.getDeclaredMethod("multiply", int.class, int.class);
		multiplyMethod.setAccessible(true);

		int result = (int) multiplyMethod.invoke(calculator, 5, 10);

		System.out.println("Multiplication Result: " + result);
	}
}
