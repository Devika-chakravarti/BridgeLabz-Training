package com.ewalletapplication;

public class Transaction{
	
	// Attributes
	private String type;
	private double amount;
	private String receiver;
	private String date;

	// Constructor
	public Transaction(String type,double amount,String receiver,String date){
		this.type=type;
		this.amount=amount;
		this.receiver=receiver;
		this.date=date;
	}

	// Concrete method to display details
	public void displayTransaction(){
		System.out.println("Transaction Details");
		System.out.println("--------------------------------");
		System.out.println("Type      : "+type);
		System.out.println("Amount    : "+amount + " Rs");
		System.out.println("To        : "+receiver);
		System.out.println("Status    : Successful");
		System.out.println("Date      : "+date);
		System.out.println("--------------------------------");
	}
}
