package com.encapsulationpolymorphismandabstraction.bankingsystem;

import java.util.ArrayList;

public class UseBankingSystem {

    public static void main(String[] args) {

        ArrayList<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SB101", "Ram", 50000));
        accounts.add(new CurrentAccount("CA202", "Sita", 80000));

        for (int i = 0; i < accounts.size(); i++) {

            BankAccount account = accounts.get(i);

            account.displayDetails();

            System.out.println("Interest Earned: " + account.calculateInterest());

            account.applyForLoan();
            System.out.println("Loan Eligibility: " + account.calculateLoanEligibility());

            System.out.println("------------------------------------");
        }
    }
}
