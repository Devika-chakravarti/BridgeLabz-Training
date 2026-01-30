// Create a custom functional interface to calculate tax.

package com.functionalinterface.customfunctionalinterface.calculatetax;

@FunctionalInterface
interface MyFunctionalInterface {
	public double calculateTax(double salary, double tax);
}

public class CalculateTax {
	public static void main(String args[]) {
		// lambda expression
		MyFunctionalInterface taxCalculation = (salary, tax) -> salary * (tax / 100);
		System.out.println("Tax: " + taxCalculation.calculateTax(70000, 5));
	}
}
