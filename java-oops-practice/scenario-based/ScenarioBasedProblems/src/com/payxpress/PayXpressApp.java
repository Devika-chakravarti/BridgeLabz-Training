/* Scenario-based: 25
 *  
 * "PayXpress – Utility Bill Payment System"
Story: PayXpress enables users to pay utility bills (electricity, water, internet) with tracking and
reminders.
Requirements:
● Bill class: type, amount, dueDate, isPaid.
● Interface IPayable with pay() and sendReminder().
● Use constructors to create recurring bills.
● Operators for calculating late fees: baseAmount + penalty.
● Encapsulation: prevent direct payment status changes.
● Inheritance: ElectricityBill, InternetBill, WaterBill.
● Polymorphism: reminders vary depending on utility type.
● Access Modifiers: payment details are internal only.
 * */

package com.payxpress;

import java.util.Scanner;

public class PayXpressApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Bill electricityBill = null;
		Bill waterBill = null;
		Bill internetBill = null;

		System.out.println("=======================================");
		System.out.println("         WELCOME TO PAYXPRESS");
		System.out.println("=======================================");

		while (true) {
			System.out.println("\n1. Create Bill");
			System.out.println("2. Send Reminder");
			System.out.println("3. Pay Bill");
			System.out.println("4. Exit");
			System.out.print("Choice: ");

			int choice = input.nextInt();

			switch (choice) {

			case 1:
				System.out.println("\nSelect Bill Type:");
				System.out.println("1. Electricity");
				System.out.println("2. Water");
				System.out.println("3. Internet");
				System.out.print("Choice: ");

				int type = input.nextInt();
				input.nextLine();

				System.out.print("Enter Amount: ");
				double amount = input.nextDouble();
				input.nextLine();

				System.out.print("Enter Due Date (YYYY-MM-DD): ");
				String date = input.nextLine();

				if (type == 1)
					electricityBill = new ElectricityBill(amount, date);
				else if (type == 2)
					waterBill = new WaterBill(amount, date);
				else if (type == 3)
					internetBill = new InternetBill(amount, date);
				else
					System.out.println("Invalid bill type!");

				System.out.println("Bill created successfully!");
				break;

			case 2:
				System.out.println("\nSend Reminder For:");
				System.out.println("1. Electricity");
				System.out.println("2. Water");
				System.out.println("3. Internet");
				System.out.print("Choice: ");

				int r = input.nextInt();

				Bill reminderBill = getBill(r, electricityBill, waterBill, internetBill);
				if (reminderBill != null)
					reminderBill.sendReminder();
				else
					System.out.println("Bill not created yet!");
				break;

			case 3:
				System.out.println("\nPay Bill For:");
				System.out.println("1. Electricity");
				System.out.println("2. Water");
				System.out.println("3. Internet");
				System.out.print("Choice: ");

				int p = input.nextInt();

				Bill payBill = getBill(p, electricityBill, waterBill, internetBill);
				if (payBill == null) {
					System.out.println("Bill not created yet!");
					break;
				}

				System.out.print("Late fee (enter 0 if none): ");
				double fee = input.nextDouble();

				payBill.pay(fee);
				break;

			case 4:
				System.out.println("\n=======================================");
				System.out.println("       THANK YOU FOR USING PAYXPRESS");
				System.out.println("=======================================");
				return;

			default:
				System.out.println("Invalid choice!");
			}
		}
	}

	private static Bill getBill(int choice, Bill e, Bill w, Bill i) {
		if (choice == 1)
			return e;
		if (choice == 2)
			return w;
		if (choice == 3)
			return i;
		return null;
	}
}
