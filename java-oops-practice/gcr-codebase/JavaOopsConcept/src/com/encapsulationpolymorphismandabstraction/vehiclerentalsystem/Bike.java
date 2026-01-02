package com.encapsulationpolymorphismandabstraction.vehiclerentalsystem;

public class Bike extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    // Constructor
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 200;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy: " + insurancePolicyNumber);
    }
}
