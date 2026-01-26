package com.annotation.customannotations.logexecutiontime;

import java.lang.reflect.Method;

public class PerformanceTester {

	@LogExecutionTime
	public void processData() {
		// Simulate some processing
		for (int i = 0; i < 1000000; i++)
			;
	}

	@LogExecutionTime
	public void computeNumbers() {
		// Another simulated computation
		long sum = 0;
		for (int i = 0; i < 500000; i++) {
			sum += i;
		}
	}

	public void normalMethod() {
		System.out.println("Normal method execution");
	}

	public static void main(String[] args) throws Exception {

		PerformanceTester tester = new PerformanceTester();

		for (Method method : tester.getClass().getDeclaredMethods()) {

			// Check if method has LogExecutionTime annotation
			if (method.isAnnotationPresent(LogExecutionTime.class)) {

				long startTime = System.nanoTime();

				method.invoke(tester);

				long endTime = System.nanoTime();

				System.out.println("Execution time of " + method.getName() + ": " + (endTime - startTime) + " ns");
			}
		}

		tester.normalMethod();
	}
}
