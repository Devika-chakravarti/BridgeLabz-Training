package com.inheritance.hierarchicalinheritance.bankaccounttypes;

public class UseBankAccount {
	public static void main(String[] args) {

        BankAccount savings = new SavingsAccount(1001, 50000, 4.5);
        BankAccount checking = new CheckingAccount(1002, 30000, 10000);
        BankAccount fixed = new FixedDepositAccount(1003, 100000, 24);

        savings.displayAccountType();
        System.out.println();

        checking.displayAccountType();
        System.out.println();

        fixed.displayAccountType();
    }
}
