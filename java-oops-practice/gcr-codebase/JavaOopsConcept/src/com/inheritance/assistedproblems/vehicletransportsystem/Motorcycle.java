package com.inheritance.assistedproblems.vehicletransportsystem;
class Motorcycle extends Vehicle {

    private boolean hasGear;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
        super(maxSpeed, fuelType);
        this.hasGear = hasGear;
    }

    // overriding displayInfo method
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Gear: " + hasGear);
    }
}
