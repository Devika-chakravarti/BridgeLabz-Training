package com.MyBank;

/*
 * SavingsAccount class represents a savings account in the bank.
 * It extends the Account base class and provides
 * a higher interest rate compared to other account types.
 */
public class SavingsAccount extends Account {

    // Fixed interest rate for savings accounts (4%)
    private static final double INTEREST_RATE = 4.0;

    /*
     * Constructor to initialize savings account
     * with account number and opening balance
     */
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance); // calls Account class constructor
    }

    /*
     * Constructor to initialize savings account
     * with account number only (balance defaults to 0)
     */
    public SavingsAccount(String accountNumber) {
        super(accountNumber); // calls Account class constructor
    }

    /*
     * Overridden method to calculate interest for savings account
     * Formula used:
     * interest = balance * interestRate / 100
     */
    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE / 100;
    }
}
