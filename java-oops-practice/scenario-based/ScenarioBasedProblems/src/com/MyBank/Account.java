package com.MyBank;

public abstract class Account {

	// Attributes
    protected String accountNumber;
    private double balance;

    // Constructor to initialize account with account number and opening balance
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    
    // Constructor to initialize account with account number only Balance is set to zero by default
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Getter method
    protected double getBalance() {
        return balance;
    }

    // Setter method
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Abstract method
    public abstract double calculateInterest();
}
