package com.objectmodeling.assistedproblems.bankaccountholderassociation;

public class Customer {
	String name;
    double balance;

    // Constructor
    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Method to view balance
    public void viewBalance() {
        System.out.println(name + "'s Balance: " + balance);
    }
}
