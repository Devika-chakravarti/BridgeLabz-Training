package com.ewalletapplication;

//common transfer feature
public interface Transferrable{
	void transferTo(User receiver,double amount);
}