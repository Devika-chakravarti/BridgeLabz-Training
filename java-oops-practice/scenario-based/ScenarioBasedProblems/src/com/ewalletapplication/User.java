package com.ewalletapplication;

//represents a wallet user
public class User{
	
	// Attributes
	private int userId;
	private String name;
	private Wallet wallet;

	// Constructor
	public User(int userId,String name,Wallet wallet){
		this.userId=userId;
		this.name=name;
		this.wallet=wallet;
	}

	// Getter
	public String getName(){
		return name;
	}

	public Wallet getWallet(){
		return wallet;
	}
}
