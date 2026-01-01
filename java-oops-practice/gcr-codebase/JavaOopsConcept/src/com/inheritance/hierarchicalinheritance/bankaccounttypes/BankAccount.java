package com.inheritance.hierarchicalinheritance.bankaccounttypes;
class BankAccount {

    // private attributes for encapsulation
    private int accountNumber;
    private double balance;

    // constructor
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // method to display basic account details
    public void displayAccountType() {
        System.out.println("General Bank Account");
    }
}
