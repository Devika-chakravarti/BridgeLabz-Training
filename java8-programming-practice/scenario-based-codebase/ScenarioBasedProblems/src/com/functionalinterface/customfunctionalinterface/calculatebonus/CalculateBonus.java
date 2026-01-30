// Create a custom functional interface to calculate bonus.

package com.functionalinterface.customfunctionalinterface.calculatebonus;

@FunctionalInterface
interface MyFunctionalInterface {
	public double calculateBonus(double salary, double percentage, int month);
}

public class CalculateBonus {
	public static void main(String args[]) {
		// lambda expression
		MyFunctionalInterface bonus = (salary, percentage, month) -> salary * percentage * month;
		System.out.println("Bonus: " + bonus.calculateBonus(70000, 30, 2));
	}
}
