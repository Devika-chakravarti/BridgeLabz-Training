/*Problem Statement:
Create a Java program with three methods:
method1(): Throws an ArithmeticException (10 / 0).
method2(): Calls method1().
main(): Calls method2() and handles the exception.
*/

package com.exceptionalhandling;

import java.util.Scanner;

public class ExceptionPropagationInMethods {

	public static void method1() {
		// for arithmetic exception
		int result = 10 / 0;
	}

	public static void method2() {
		// exception propagates to caller
		method1();
	}

	public static void main(String args[]) {
		try {
			// exception propagates from method1 to method2 and then main
			method2();
		} catch (ArithmeticException e) {
			System.out.println("Handled exception in main: " + e.getMessage());
		}
	}
}
