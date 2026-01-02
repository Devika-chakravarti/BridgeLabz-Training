package com.encapsulationpolymorphismandabstraction.bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable {

	// Constructor
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan applied under Current Account");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 3;
    }
}
