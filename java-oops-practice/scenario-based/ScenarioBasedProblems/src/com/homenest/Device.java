package com.homenest;

public abstract class Device implements IControllable {

	protected String deviceId;
	private String status;
	protected double energyUsage; // kWh
	protected String type;
	protected String[] firmwareUpdateLogs; // secure logs

	public Device(String deviceId, String type) {
		this.deviceId = deviceId;
		this.type = type;
		this.status = "OFF";
		this.energyUsage = 0;
		this.firmwareUpdateLogs = new String[100];
	}

	public String getStatus() {
		return status;
	}

	protected void setStatus(String status) {
		this.status = status;
	}

	public double getEnergyUsage() {
		return energyUsage;
	}

	public String getType() {
		return type;
	}

	@Override
	public void turnOn() {
		setStatus("ON");
		energyUsage += 1; // simulate 1 kWh usage
		System.out.println(type + " device turned ON successfully.");
		System.out.println("Current Energy Usage: " + (int) energyUsage + " kWh\n");
	}

	@Override
	public void turnOff() {
		setStatus("OFF");
		System.out.println(type + " device turned OFF successfully.\n");
	}

	@Override
	public abstract void reset();
}
