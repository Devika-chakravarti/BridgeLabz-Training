/* Scenario-based: 3
 * 
 * ZipZipMart – Daily Sales Summary Report (Merge Sort)
 * Story: ZipZipMart compiles thousands of daily sales records from all branches.
 * To generate reports, the system sorts transactions by date and amount using
 * Merge Sort, which ensures stability and efficiency with large datasets.
 * Key Concepts:
 * ● Divide and conquer
 * ● Large-scale sorting
 * ● Stable sorting
 */

package com.sorting.zipzipmart;

import java.util.Scanner;

public class ZipZipMart {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("==============================================");
		System.out.println("      ZipZipMart - Daily Sales Report System");
		System.out.println("==============================================\n");

		System.out.print("Enter number of branches: ");
		int branches = input.nextInt();

		System.out.print("Enter number of transactions per branch: ");
		int perBranch = input.nextInt();
		input.nextLine();

		Sale[] allSales = new Sale[branches * perBranch];
		int index = 0;

		for (int b = 1; b <= branches; b++) {
			System.out.println("\nBranch " + b + " Transactions:");
			for (int t = 1; t <= perBranch; t++) {
				System.out.print("Date (YYYYMMDD): ");
				String date = input.nextLine();

				System.out.print("Amount: ");
				double amount = input.nextDouble();
				input.nextLine();

				allSales[index++] = new Sale(date, amount, "Branch-" + b);
			}
		}

		// Merge Sort to sort all transactions
		ZipZipMartMergeSort.mergeSort(allSales, 0, allSales.length - 1);

		System.out.println("\nSorted Transactions (By Date then Amount):");
		for (Sale s : allSales)
			s.show();

		input.close();
	}
}
