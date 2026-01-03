package com.vehiclerentalapplication;
public class Bike extends Vehicle{
	
	// Constructor
    public Bike(int vehicleId,String brand,double baseRate){
        super(vehicleId,brand,baseRate);
    }

    // Implementation of the abstract method (inside Vehicle class)
    protected String getType(){
        return "Bike";
    }

    // Implementation of the abstract method (inside interface)
    public double calculateRent(int days){
        return baseRate*days;
    }
}
