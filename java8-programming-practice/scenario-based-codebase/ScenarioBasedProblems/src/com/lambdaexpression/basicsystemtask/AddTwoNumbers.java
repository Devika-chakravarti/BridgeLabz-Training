// Use lambda to add two numbers.

package com.lambdaexpression.basicsystemtask;

@FunctionalInterface
interface AddNumber {
	int addition(int a, int b);
}

public class AddTwoNumbers {
	public static void main(String args[]) {
		// lambda expression
		AddNumber adder = (a, b) -> a + b;
		System.out.println(adder.addition(5, 8));
	}
}
