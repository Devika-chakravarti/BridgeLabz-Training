package com.encapsulationpolymorphismandabstraction.vehiclerentalsystem;

import java.util.ArrayList;

public class UseVehicleRentalSystem {

    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 1500, "INS-CAR-01"));
        vehicles.add(new Bike("BIKE202", 500, "INS-BIKE-02"));
        vehicles.add(new Truck("TRUCK303", 3000, "INS-TRUCK-03"));

        int rentalDays = 3;

        for (int i = 0; i < vehicles.size(); i++) {

            Vehicle vehicle = vehicles.get(i);

            vehicle.displayDetails();

            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            double insuranceCost = vehicle.calculateInsurance();

            vehicle.getInsuranceDetails();

            System.out.println("Rental Cost (" + rentalDays + " days): " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println("Total Cost: " + (rentalCost + insuranceCost));
            System.out.println("----------------------------------");
        }
    }
}
