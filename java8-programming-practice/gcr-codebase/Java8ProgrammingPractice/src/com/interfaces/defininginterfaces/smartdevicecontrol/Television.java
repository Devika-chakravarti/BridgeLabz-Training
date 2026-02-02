package com.interfaces.defininginterfaces.smartdevicecontrol;

public class Television implements SmartDevice {

	@Override
	public void turnOn() {
		System.out.println("TV is turned ON");
	}

	@Override
	public void turnOff() {
		System.out.println("TV is turned OFF");
	}
}
