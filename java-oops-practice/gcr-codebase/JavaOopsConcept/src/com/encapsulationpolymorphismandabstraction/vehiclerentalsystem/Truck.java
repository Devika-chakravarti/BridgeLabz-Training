package com.encapsulationpolymorphismandabstraction.vehiclerentalsystem;

public class Truck extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    // Constructor
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + 1000;
    }

    @Override
    public double calculateInsurance() {
        return 1000;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy: " + insurancePolicyNumber);
    }
}
