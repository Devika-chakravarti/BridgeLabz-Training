package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class UseVehicleManagementSystem {
	public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle(160, "Tesla Model 3");
        PetrolVehicle pv = new PetrolVehicle(180, "Honda City");

        ev.charge();
        pv.refuel();
    }
}
