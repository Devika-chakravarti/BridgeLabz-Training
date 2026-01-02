package com.encapsulationpolymorphismandabstraction.ridehailingapplication;

import java.util.ArrayList;

public class UseRideHailingApplication {

    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("C101", "Rahul", 15));
        vehicles.add(new Bike("B201", "Anita", 10));
        vehicles.add(new Auto("A301", "Suresh", 8));

        calculateFares(vehicles, 12); // Example distance 12 km
    }

    public static void calculateFares(ArrayList<Vehicle> vehicles, double distance) {

        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle v = vehicles.get(i);

            v.getVehicleDetails();
            System.out.println("Current Location: " + ((GPS)v).getCurrentLocation());

            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));

            ((GPS)v).updateLocation("Customer Pickup Point");
            System.out.println("Updated Location: " + ((GPS)v).getCurrentLocation());

            System.out.println("----------------------------------------");
        }
    }
}
