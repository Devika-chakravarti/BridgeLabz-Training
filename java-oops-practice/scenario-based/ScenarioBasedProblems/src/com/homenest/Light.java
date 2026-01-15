package com.homenest;

public class Light extends Device {

	public Light(String deviceId) {
		super(deviceId, "Light");
	}

	@Override
	public void reset() {
		// toggle OFF then ON
		setStatus("OFF");
		setStatus("ON");
		System.out.println("Light device reset successfully.\n");
	}
}
