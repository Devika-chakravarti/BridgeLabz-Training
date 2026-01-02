package com.encapsulationpolymorphismandabstraction.vehiclerentalsystem;

public class Car extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    // Constructor
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy: " + insurancePolicyNumber);
    }
}
