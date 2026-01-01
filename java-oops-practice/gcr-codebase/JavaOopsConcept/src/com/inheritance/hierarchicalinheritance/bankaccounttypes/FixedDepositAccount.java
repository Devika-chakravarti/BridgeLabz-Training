package com.inheritance.hierarchicalinheritance.bankaccounttypes;
class FixedDepositAccount extends BankAccount {

    private int tenure; // in months

    public FixedDepositAccount(int accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    // overriding method
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Tenure: " + tenure + " months");
    }
}
