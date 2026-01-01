package com.inheritance.hybridinheritance.vehiclemanagementsystem;
class Vehicle {

    // private attributes for encapsulation
    private int maxSpeed;
    private String model;

    // constructor
    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // getters
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }
}
