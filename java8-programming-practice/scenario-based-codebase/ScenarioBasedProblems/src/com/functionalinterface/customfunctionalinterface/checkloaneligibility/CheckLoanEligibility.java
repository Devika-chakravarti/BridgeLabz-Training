// Create a custom functional interface to check loan eligibility.

package com.functionalinterface.customfunctionalinterface.checkloaneligibility;

@FunctionalInterface
interface MyFunctionalInterface {
	public boolean isEligibile(double creditScore);
}

public class CheckLoanEligibility {
	public static void main(String args[]) {
		// lambda expression
		MyFunctionalInterface eligibility = creditScore -> creditScore >= 7.0;
		System.out.println(eligibility.isEligibile(10));
	}
}
