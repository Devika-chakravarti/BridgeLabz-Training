package com.constructor.levelone;

// BankAccount class
public class BankAccount{

    // Attributes
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Parameterized constructor
    public BankAccount(String accountNumber,String accountHolder,double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance(){
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance){
        this.balance = balance;
    }

    // Display account details
    public void displayAccountDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}
