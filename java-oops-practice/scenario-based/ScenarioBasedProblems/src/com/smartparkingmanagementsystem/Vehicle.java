package com.smartparkingmanagementsystem;

public abstract class Vehicle {

    protected String vehicleNumber;
    protected double baseRate;

    public Vehicle(String vehicleNumber, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.baseRate = baseRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public double getBaseRate() {
        return baseRate;
    }
}
