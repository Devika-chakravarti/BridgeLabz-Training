package com.lambdaexpression.basicsystemtask;

@FunctionalInterface
interface FindGreaterNumber {
	String greaterNumber(int a, int b);
}

public class GreaterNumber {
	public static void main(String args[]) {
		// lambda expression
		FindGreaterNumber greaternum = (a, b) -> {
			if (a > b) {
				return a + " is greater";
			} else {
				return b + " is greater";
			}
		};
		System.out.println(greaternum.greaterNumber(2, 5));
	}
}
