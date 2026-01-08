package com.complexityanalysis;

public class FibonacciComputation {

	// Recursive Fibonacci O(2^N)
	public static int fibonacciRecursive(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}

	// Iterative Fibonacci O(N)
	public static int fibonacciIterative(int n) {
		if (n <= 1) {
			return n;
		}

		int a = 0;
		int b = 1;
		int sum = 0;

		for (int i = 2; i <= n; i++) {
			sum = a + b;
			a = b;
			b = sum;
		}
		return b;
	}

	public static void main(String[] args) {

		int[] testValues = { 10, 30, 50 };

		for (int i = 0; i < testValues.length; i++) {

			int n = testValues[i];
			System.out.println("Fibonacci Number: " + n);

			// Recursive Fibonacci (skip for large N)
			if (n <= 30) {
				long startRecursive = System.nanoTime();
				int recursiveResult = fibonacciRecursive(n);
				long endRecursive = System.nanoTime();

				System.out.println("Recursive Result: " + recursiveResult);
				System.out.println("Recursive Time (ns): " + (endRecursive - startRecursive));
			} else {
				System.out.println("Recursive: Skipped");
			}

			// Iterative Fibonacci
			long startIterative = System.nanoTime();
			int iterativeResult = fibonacciIterative(n);
			long endIterative = System.nanoTime();

			System.out.println("Iterative Result: " + iterativeResult);
			System.out.println("Iterative Time (ns): " + (endIterative - startIterative));

			System.out.println("-------------------------------------");
		}
	}
}
