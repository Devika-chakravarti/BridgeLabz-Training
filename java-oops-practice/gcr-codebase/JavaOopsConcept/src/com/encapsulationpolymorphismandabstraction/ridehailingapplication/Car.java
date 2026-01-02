package com.encapsulationpolymorphismandabstraction.ridehailingapplication;

public class Car extends Vehicle implements GPS {

    private String currentLocation;

    // Constructor
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Garage";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 50; // Extra comfort charge
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}
