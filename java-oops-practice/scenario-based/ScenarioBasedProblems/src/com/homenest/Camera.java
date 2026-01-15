package com.homenest;

public class Camera extends Device {

	public Camera(String deviceId) {
		super(deviceId, "Camera");
	}

	@Override
	public void reset() {
		System.out.println("Camera feed restarted successfully.\n");
	}
}
