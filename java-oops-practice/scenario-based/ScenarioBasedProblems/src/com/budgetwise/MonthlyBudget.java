package com.budgetwise;

public class MonthlyBudget extends Budget {

	public MonthlyBudget(double limit, String[] categoryNames, double[] categoryLimits) {
		super(limit, categoryNames, categoryLimits);
	}

	@Override
	public void generateReport() {
		System.out.println("---------- MONTHLY BUDGET REPORT ----------");
		System.out.println("Income        : " + income);
		System.out.println("Expenses      : " + getTotalExpenses());
		System.out.println("Net Savings   : " + getNetSavings());
		System.out.println("------------------------------------------");

		for (int i = 0; i < categoryLimitsNames.length; i++) {
			double spent = 0;

			for (int j = 0; j < transactions.size(); j++) {
				Transaction t = transactions.get(j);
				if (t.getType().equalsIgnoreCase("EXPENSE")
						&& t.getCategory().equalsIgnoreCase(categoryLimitsNames[i])) {
					spent += t.getAmount();
				}
			}

			String status = spent > categoryLimitsValues[i] ? "Overspent" : "Within Limit";
			System.out.println(
					categoryLimitsNames[i] + ": " + spent + "/" + categoryLimitsValues[i] + " (" + status + ")");
		}
		System.out.println("------------------------------------------");
	}

	@Override
	public void detectOverspend() {
		System.out.println("---------- OVESPENDING CHECK ----------");
		boolean found = false;

		for (int i = 0; i < categoryLimitsNames.length; i++) {
			double spent = 0;

			for (int j = 0; j < transactions.size(); j++) {
				Transaction t = transactions.get(j);
				if (t.getType().equalsIgnoreCase("EXPENSE")
						&& t.getCategory().equalsIgnoreCase(categoryLimitsNames[i])) {
					spent += t.getAmount();
				}
			}

			if (spent > categoryLimitsValues[i]) {
				System.out.println(categoryLimitsNames[i] + " exceeded limit!");
				found = true;
			}
		}

		if (!found) {
			System.out.println("No overspending detected.");
		}
		System.out.println("--------------------------------------");
	}
}
