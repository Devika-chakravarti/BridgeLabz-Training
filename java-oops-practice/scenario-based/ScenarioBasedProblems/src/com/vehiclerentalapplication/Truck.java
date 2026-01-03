package com.vehiclerentalapplication;
public class Truck extends Vehicle{
	
	// Constructor
    public Truck(int vehicleId,String brand,double baseRate){
        super(vehicleId,brand,baseRate);
    }

    // Implementation of the abstract method (inside Vehicle class)
    protected String getType(){
        return "Truck";
    }

    // Implementation of the abstract method (inside interface)
    public double calculateRent(int days){
        return (baseRate*days)+1000;
    }
}
