package com.MyBank;

public interface ITransaction {
	
	// abstract methods to override/implement in other methods
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}
