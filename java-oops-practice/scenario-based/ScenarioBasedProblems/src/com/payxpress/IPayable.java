package com.payxpress;

public interface IPayable {
	void pay(double lateFee);

	void sendReminder();
}
