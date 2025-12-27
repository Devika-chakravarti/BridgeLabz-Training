package com.constructor.levelone;

public class Vehicle{

    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable
    private static double registrationFee = 10000;

    // Parameterized constructor
    Vehicle(String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    void displayVehicleDetails(){
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee + " Rs\n");
    }

    // Class method to update registration fee
    static void updateRegistrationFee(double newFee){
        registrationFee = newFee;
    }

    public static void main(String[] args){

        Vehicle v1 = new Vehicle("Devika", "Car");
        v1.displayVehicleDetails();

        Vehicle.updateRegistrationFee(6500);

        Vehicle v2 = new Vehicle("Ram", "Bike");
        v2.displayVehicleDetails();
    }
}
