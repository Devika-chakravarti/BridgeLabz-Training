package com.budgetwise;

import java.util.ArrayList;
import java.util.List;

public abstract class Budget implements IAnalyzable {

	protected double income;
	protected double limit;
	protected String[] categoryLimitsNames;
	protected double[] categoryLimitsValues;
	protected List<Transaction> transactions;

	public Budget(double limit, String[] categoryNames, double[] categoryLimits) {
		this.income = 0;
		this.limit = limit;
		this.categoryLimitsNames = categoryNames;
		this.categoryLimitsValues = categoryLimits;
		this.transactions = new ArrayList<>();
	}

	public void addTransaction(Transaction t) {
		transactions.add(t);

		if (t.getType().equalsIgnoreCase("INCOME")) {
			income += t.getAmount();
		}
	}

	public double getTotalExpenses() {
		double total = 0;
		for (int i = 0; i < transactions.size(); i++) {
			Transaction t = transactions.get(i);
			if (t.getType().equalsIgnoreCase("EXPENSE")) {
				total += t.getAmount();
			}
		}
		return total;
	}

	public double getNetSavings() {
		return income - getTotalExpenses();
	}

	public abstract void generateReport();

	public abstract void detectOverspend();
}
