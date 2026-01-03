/* Scenario-based: 4
 * 
 * E-Wallet Application
Scenario: Users can register, load money, transfer funds, and view transaction history.
Concepts Used:
● Class: User, Wallet, Transaction
● Constructors: Initialize wallets with optional referral bonus
● Access Modifiers: Make balance private, expose via getBalance()
● Interface: Transferrable with method transferTo(User receiver, double
amount)
● Operators: Used in deductions, taxes, referral credits
● OOP:
○ Encapsulation: Prevent direct manipulation of balance
○ Abstraction: Expose only essential transaction methods
○ Inheritance: PersonalWallet, BusinessWallet with different limits
○ Polymorphism: Same transferTo() method but different business logic
 * */


package com.ewalletapplication;

public class UseEwalletApplication{
 public static void main(String[] args){

	 System.out.println("----- E-Wallet Application -----");
     Wallet w1=new PersonalWallet(1000);
     Wallet w2=new BusinessWallet(2000);

     User u1=new User(1,"Anjali",w1);
     User u2=new User(2,"Devika",w2);

     u1.getWallet().transferTo(u2,700);
 }
}


