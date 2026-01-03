package com.MyBank;

/*
 * CurrentAccount class represents a current account in the bank.
 * It extends the Account base class and provides its own
 * implementation for interest calculation.
 */
public class CurrentAccount extends Account {

    // Fixed interest rate for current accounts (2%)
    private static final double INTEREST_RATE = 2.0;

    /*
     * Constructor to initialize current account
     * with account number and opening balance
     */
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance); // calls Account class constructor
    }

    /*
     * Constructor to initialize current account
     * with account number only (balance defaults to 0)
     */
    public CurrentAccount(String accountNumber) {
        super(accountNumber); // calls Account class constructor
    }

    /*
     * Overridden method to calculate interest for current account
     * Formula used:
     * interest = balance * interestRate / 100
     */
    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE / 100;
    }
}
