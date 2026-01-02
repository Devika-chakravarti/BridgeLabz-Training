package com.encapsulationpolymorphismandabstraction.bankingsystem;

public class SavingsAccount extends BankAccount implements Loanable {

	// Constructor
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan applied under Savings Account");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5;
    }
}
