package com.vehiclerentalapplication;
public class Customer{
	
	// Attributes
    private int customerId;
    private String name;

    // Constructor
    public Customer(int customerId,String name){
        this.customerId=customerId;
        this.name=name;
    }

    // Concrete method
    public void displayInfo(){
        System.out.println("Customer: "+name);
    }
}
