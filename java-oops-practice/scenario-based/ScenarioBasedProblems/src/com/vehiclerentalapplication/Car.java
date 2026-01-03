package com.vehiclerentalapplication;
public class Car extends Vehicle{
	
	// Constructor
    public Car(int vehicleId,String brand,double baseRate){
        super(vehicleId,brand,baseRate);
    }

    // Implementation of the abstract method (inside Vehicle class)
    protected String getType(){
        return "Car";
    }

    // Implementation of the abstract method (inside interface)
    public double calculateRent(int days){
        return (baseRate*days)+500;
    }
}
