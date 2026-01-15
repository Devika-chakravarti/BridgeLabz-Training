package com.homenest;

public class Thermostat extends Device {

	public Thermostat(String deviceId) {
		super(deviceId, "Thermostat");
	}

	@Override
	public void reset() {
		System.out.println("Thermostat reset to default temperature.\n");
	}
}
