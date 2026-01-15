/* Scenario-based: 23
 * 
 * "BudgetWise – Personal Finance Tracker"
Story: BudgetWise helps users plan monthly budgets and track income/expenses across
categories.
Requirements:
● Transaction class: amount, type, date, category.
● Budget class: income, limit, categoryLimits[].
● Interface IAnalyzable with generateReport() and detectOverspend().
● Constructors for monthly budgets with custom categories.
● Use operators to calculate net savings: income - totalExpenses.
● Encapsulation: restrict direct expense editing.
● Inheritance: MonthlyBudget, AnnualBudget.
● Polymorphism: report format varies (monthly vs yearly).
 * */

package com.budgetwise;

import java.util.Scanner;

public class UseBudgetWise {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] expenseCategories = { "Food", "Travel", "Rent" };
		double[] limits = { 7000, 4000, 15000 };

		MonthlyBudget budget = new MonthlyBudget(30000, expenseCategories, limits);

		System.out.println("=====================================================");
		System.out.println("                WELCOME TO BUDGETWISE");
		System.out.println("=====================================================");

		while (true) {
			System.out.println("\n1. Add Transaction");
			System.out.println("2. View Report");
			System.out.println("3. Detect Overspending");
			System.out.println("4. View Net Savings");
			System.out.println("5. Exit");
			System.out.print("Choice: ");

			int choice = input.nextInt();
			input.nextLine();

			switch (choice) {
			case 1:
				System.out.println("1. Income");
				System.out.println("2. Expense");
				int typeChoice = input.nextInt();
				input.nextLine();

				System.out.print("Amount: ");
				double amt = input.nextDouble();
				input.nextLine();

				System.out.print("Date: ");
				String date = input.nextLine();

				if (typeChoice == 1) {
					System.out.print("Income Source (Job/Freelance/Business): ");
					String source = input.nextLine();
					budget.addTransaction(new Transaction(amt, "INCOME", date, source));
				} else {
					System.out.print("Expense Category (Food/Travel/Rent): ");
					String category = input.nextLine();
					budget.addTransaction(new Transaction(amt, "EXPENSE", date, category));
				}

				System.out.println("Transaction added successfully!");
				break;

			case 2:
				budget.generateReport();
				break;

			case 3:
				budget.detectOverspend();
				break;

			case 4:
				System.out.println("Net Savings: " + budget.getNetSavings());
				break;

			case 5:
				System.out.println("\n=====================================================");
				System.out.println("          THANK YOU FOR USING BUDGETWISE");
				System.out.println("=====================================================");
				return;
			}
		}
	}
}
