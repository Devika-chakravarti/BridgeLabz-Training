package com.inheritance.hybridinheritance.vehiclemanagementsystem;

class PetrolVehicle extends Vehicle implements Refuelable {

    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // implementing interface method
    public void refuel() {
        System.out.println("Petrol vehicle is being refueled.");
    }
}
