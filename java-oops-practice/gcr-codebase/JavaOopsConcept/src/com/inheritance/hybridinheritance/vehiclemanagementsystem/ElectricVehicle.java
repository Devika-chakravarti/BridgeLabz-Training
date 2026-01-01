package com.inheritance.hybridinheritance.vehiclemanagementsystem;
class ElectricVehicle extends Vehicle {

    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // method specific to electric vehicles
    public void charge() {
        System.out.println("Electric vehicle is charging.");
    }
}
