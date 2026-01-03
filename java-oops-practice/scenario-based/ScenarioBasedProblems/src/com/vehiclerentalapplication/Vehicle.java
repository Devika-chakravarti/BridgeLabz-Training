package com.vehiclerentalapplication;
public abstract class Vehicle implements Rentable{
	
	// Attributes
    protected int vehicleId;
    protected String brand;
    protected double baseRate;

    // Constructor
    public Vehicle(int vehicleId,String brand,double baseRate){
        this.vehicleId=vehicleId;
        this.brand=brand;
        this.baseRate=baseRate;
    }

    // Abstract method
    protected abstract String getType();

    // Display details of the vehicles
    public void printDetails(int days){
        System.out.println("--------------------------------");
        System.out.println("Vehicle Type: "+getType());
        System.out.println("Vehicle ID: "+vehicleId);
        System.out.println("Brand: "+brand);
        System.out.println("Rent for "+days+" days: "+calculateRent(days));
    }
}
