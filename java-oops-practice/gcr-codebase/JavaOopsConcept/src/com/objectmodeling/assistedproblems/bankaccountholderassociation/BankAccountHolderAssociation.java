package com.objectmodeling.assistedproblems.bankaccountholderassociation;

public class BankAccountHolderAssociation {
	public static void main(String[] args) {

        // Create bank
        Bank bank = new Bank("State Bank of India");

        // Create customers
        Customer c1 = new Customer("Ram", 5000);
        Customer c2 = new Customer("Sita", 10000);

        // Associate customers with bank
        bank.openAccount(c1);
        bank.openAccount(c2);

        // Customers view their balance
        c1.viewBalance();
        c2.viewBalance();
    }
}
