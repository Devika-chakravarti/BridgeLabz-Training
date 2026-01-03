/* Scenario-based: 2
 * 
 * Vehicle Rental Application
Scenario: Build a system for renting bikes, cars, and trucks to customers.
Concepts Used:
● Class: Vehicle, Bike, Car, Truck, Customer

Scenario-based Problems
● Constructors: Custom constructors for different vehicle types
● Access Modifiers: protected for vehicle attributes to allow subclass access
● Interface: Rentable with method calculateRent(int days)
● Operators: Used in rent calculation (e.g., baseRate × days ± surcharges)
● OOP:
○ Abstraction: Rentable abstracts rental behavior
○ Inheritance: Car, Bike, Truck inherit from Vehicle
○ Polymorphism: Rent calculation differs by vehicle type
○ Encapsulation: All fields hidden behind getters/setters*/


package com.vehiclerentalapplication;
public class UseVehicleRentalApplication{
    public static void main(String[] args){
    	
    	System.out.println("-- Vehicle Rental Application --");
        Customer c1=new Customer(1,"Devika Chakravarti");

        Vehicle v1=new Bike(101,"Yamaha",300);
        Vehicle v2=new Car(102,"Honda",800);
        Vehicle v3=new Truck(103,"Tata",1500);

        c1.displayInfo();
        
        v1.printDetails(3);
        v2.printDetails(3);
        v3.printDetails(3);
        System.out.println("--------------------------------");
    }
}
