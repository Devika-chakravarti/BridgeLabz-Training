package com.interfaces.usingdefaultmethods.smartvehicledashboard;

public interface VehicleDashboard {
	void displaySpeed();
	default void displayBatteryStatus() {
		System.out.println("Battery status not available");
	}
}
