package com.constructor.levelone;

// Subclass demonstrating access to accountNumber and accountHolder
public class SavingsAccount extends BankAccount{

    private double interestRate;

    // Parameterized constructor
    public SavingsAccount(String accountNumber,String accountHolder,double balance,double interestRate){
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Display savings account details
    public void displaySavingsDetails(){
        // Accessing public and protected members from superclass
        System.out.println("Savings Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args){
        SavingsAccount sa = new SavingsAccount("AZ12345","Devika",50000,4.5);
        sa.displaySavingsDetails();

        // Modify balance using public setter
        sa.setBalance(55000);
        System.out.println("\nAfter updating balance:");
        sa.displaySavingsDetails();
    }
}
