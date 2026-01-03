package com.ewalletapplication;

//base wallet class
public abstract class Wallet implements Transferrable{
	
	// Attribute
	private double balance; // hidden balance

	// Constructor
	public Wallet(double balance){
		this.balance=balance;
	}

	// Getter to show balance safely
	public double getBalance(){
		return balance;
	}

	// Concrete method to add money internally
	protected void addMoney(double amount){
		balance+=amount;
	}

	// Concrete method to deduct money if possible
	protected boolean deductMoney(double amount){
		if(balance>=amount){
			balance-=amount;
			return true;
		}
		return false;
	}
}
