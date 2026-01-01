package com.objectmodeling.assistedproblems.bankaccountholderassociation;
import java.util.ArrayList;
public class Bank {
	String bankName;
    ArrayList<Customer> customers = new ArrayList<>();

    // Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
    }

    // Method to open account
    public void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println(customer.name + " opened an account in " + bankName);
    }
}
