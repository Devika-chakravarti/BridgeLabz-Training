package com.lambdaexpression.basicsystemtask;

@FunctionalInterface
interface EvenOdd {
	String isEven(int a);
}

public class EvenOddNumber {
	public static void main(String args[]) {
		// lambda expression
		EvenOdd check = a -> {
			if (a % 2 == 0) {
				return "Even number";
			} else {
				return "Odd number";
			}
		};
		System.out.println(check.isEven(5));
	}
}
