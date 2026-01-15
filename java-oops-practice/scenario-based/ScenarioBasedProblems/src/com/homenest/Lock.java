package com.homenest;

public class Lock extends Device {

	public Lock(String deviceId) {
		super(deviceId, "Lock");
	}

	@Override
	public void reset() {
		System.out.println("Lock mechanism reset successfully.\n");
	}
}
