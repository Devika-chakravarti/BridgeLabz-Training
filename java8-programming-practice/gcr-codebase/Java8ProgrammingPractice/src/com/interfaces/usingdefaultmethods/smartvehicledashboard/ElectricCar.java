package com.interfaces.usingdefaultmethods.smartvehicledashboard;

public class ElectricCar implements VehicleDashboard {
    @Override
    public void displaySpeed() {
        System.out.println("Speed: 90 km/h");
    }
    @Override
    public void displayBatteryStatus() {
        System.out.println("Battery: 75%");
    }
}
