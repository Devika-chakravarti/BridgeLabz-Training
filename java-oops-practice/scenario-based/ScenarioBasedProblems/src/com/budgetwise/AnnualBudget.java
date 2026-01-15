package com.budgetwise;

public class AnnualBudget extends Budget {

	public AnnualBudget(double limit, String[] categoryNames, double[] categoryLimits) {
		super(limit, categoryNames, categoryLimits);
	}

	@Override
	public void generateReport() {
		System.out.println("---------- ANNUAL BUDGET REPORT ----------");
		System.out.println("Income    : " + income);
		System.out.println("Expenses  : " + getTotalExpenses());
		System.out.println("Savings   : " + getNetSavings());
		System.out.println("-----------------------------------------");
	}

	@Override
	public void detectOverspend() {
		if (getTotalExpenses() > limit) {
			System.out.println("Annual overspending detected!");
		} else {
			System.out.println("Annual spending within limit.");
		}
	}
}
