/* Scenario-based: 7 
 * 
 * "MyBank – Managing Customer Accounts"
Story: You're building the core banking module for MyBank, a digital-first bank. Your job is to
manage customer accounts, deposits, and interest calculations.
Requirements:
● Account (base class): fields like accountNumber, balance.
● Derived classes: SavingsAccount, CurrentAccount (using inheritance).
● ITransaction interface: deposit(), withdraw(), checkBalance().
● Use constructors for account initialization with or without an opening balance.
● Encapsulation: balance must be private and only modifiable through methods.
● Use operators for interest: balance * interestRate / 100.
● Polymorphism in calculateInterest() – varies by account type.
● Use access modifiers: protect account data, expose only required operations.
 * */


package com.MyBank;

import java.util.Scanner;

public class UseMyBank implements ITransaction {

    // Reference of Account class (polymorphism)
    private Account account;

    /*
     * Constructor to initialize the bank application
     * with a specific account type (Savings or Current)
     */
    public UseMyBank(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Amount Deposited : " + amount + " Rs");
    }

    @Override
    public void withdraw(double amount) {
        if (amount > account.getBalance()) {
            System.out.println("Withdrawal Failed : Insufficient Balance");
        } else {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Amount Withdrawn : " + amount + " Rs");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance  : " + account.getBalance() + " Rs");
    }
    
    // Method to shoe the interest amount
    public void showInterest() {
        System.out.println("Interest Amount  : " + account.calculateInterest() + " Rs");
    }

    // Main method to take input from the users 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===============================================");
        System.out.println("               WELCOME TO MYBANK               ");
        System.out.println("===============================================\n");

        // Account type selection
        System.out.println("Enter Account Type: ");
        System.out.println("1. Savings");
        System.out.println("2. Current");
        int choice = input.nextInt();

        input.nextLine(); 

        // Account details input
        System.out.print("Enter Account Number: ");
        String accNo = input.nextLine();

        System.out.print("Enter Opening Balance: ");
        double balance = input.nextDouble();

        // Account object creation using polymorphism
        Account account;

        if (choice == 1) {
            account = new SavingsAccount(accNo, balance);
        } else {
            account = new CurrentAccount(accNo, balance);
        }

        UseMyBank app = new UseMyBank(account);

        System.out.println("\n---------------------------------");
        app.checkBalance();
        System.out.println("---------------------------------\n");
        
        System.out.print("Enter Deposit Amount: ");
        double depositAmount = input.nextDouble();
        app.deposit(depositAmount);
        app.checkBalance();

        System.out.print("\nEnter Withdrawal Amount: ");
        double withdrawAmount = input.nextDouble();
        app.withdraw(withdrawAmount);
        app.checkBalance();

        System.out.println("\n---------------------------------");
        app.showInterest();
        System.out.println("---------------------------------");

        input.close(); 
    }
}
