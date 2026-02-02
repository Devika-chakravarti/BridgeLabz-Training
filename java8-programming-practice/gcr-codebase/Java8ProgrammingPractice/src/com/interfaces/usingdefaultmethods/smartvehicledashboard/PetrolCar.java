package com.interfaces.usingdefaultmethods.smartvehicledashboard;

public class PetrolCar implements VehicleDashboard {
    @Override
    public void displaySpeed() {
        System.out.println("Speed: 80 km/h");
    }
}
