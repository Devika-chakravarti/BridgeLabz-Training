package com.constructor.levelone;

public class CarRentalSystem {

    // Attributes
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double costPerDay;

    // Default constructor
    CarRentalSystem() {
        this("Devika", "Ferrari", 3, 50000);
    }

    // Parameterized constructor
    CarRentalSystem(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }

    // Private method to calculate total cost
    private double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // Getters
    public String getCustomerName() {
        return customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    // Display rental details
    void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Cost per Day: " + costPerDay + " Rs");
        System.out.println("Total Cost: " + calculateTotalCost() + " Rs\n");
    }

    public static void main(String[] args) {

        CarRentalSystem rental1 = new CarRentalSystem();
        rental1.displayRentalDetails();

        CarRentalSystem rental2 = new CarRentalSystem("Rahul", "Creta", 5, 1800);
        rental2.displayRentalDetails();
    }
}
