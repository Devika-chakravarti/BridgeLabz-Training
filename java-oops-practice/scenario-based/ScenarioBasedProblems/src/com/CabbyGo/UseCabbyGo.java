/* Scenario-based: 6
 * 
 * "CabbyGo – A Ride-Hailing App in the Making"
Story: You’ve joined a startup building CabbyGo, a ride-hailing app. You're tasked with building
the backend logic for managing vehicles, drivers, and ride booking.
Requirements:
● Vehicle (class): fields like vehicleNumber, capacity, type.
● Driver (class): fields like name, licenseNumber, rating.
● Constructors to initialize vehicles and drivers.
● An IRideService interface with methods like bookRide() and endRide().
● Use encapsulation to hide sensitive data like location, fare.
● Implement polymorphism with different vehicle types like Mini, Sedan, SUV (all extend
Vehicle).
● Use operators to calculate fare: baseFare + distance * rate.
● Apply access modifiers carefully: private for rating and fare, public methods to
read data.
 * */


package com.CabbyGo;
public class UseCabbyGo implements IRideService {

    private double fare; // private fare for encapsulation

    @Override
    public void bookRide(Vehicle vehicle, Driver driver, double distance) {
        fare = vehicle.calculateFare(distance);

        System.out.println("-------------------------------------");
        System.out.println("      RIDE BOOKED SUCCESSFULLY        ");
        System.out.println("-------------------------------------\n");

        System.out.println("Vehicle Information:");
        System.out.println("- Type       : " + vehicle.type);
        System.out.println("- Number     : " + vehicle.vehicleNumber);
        System.out.println("- Capacity   : " + vehicle.capacity + " passengers\n");

        System.out.println("Driver Information:");
        System.out.println("- Name       : " + driver.getName());
        System.out.println("- License No.: " + driver.getLicenseNumber());
        System.out.println("- Rating     : " + driver.getRating() + "\n");

        System.out.println("Ride Information:");
        System.out.println("- Distance       : " + distance + " km");
        System.out.println("- Estimated Fare : " + fare + " Rs");

    }

    @Override
    public void endRide() {
        System.out.println("\n-------------------------------------");
        System.out.println("       RIDE ENDED SUCCESSFULLY         ");
        System.out.println("-------------------------------------");
        System.out.println("Total Fare : " + fare + " Rs");
        System.out.println("-------------------------------------\n\n");
    }

    public static void main(String[] args) {
        // Vehicles
        Vehicle suv = new SUV("MP04AB1234");
        Vehicle sedan = new Sedan("MP04CD5678");
        Vehicle mini = new Mini("MP04XY9876");

        // Drivers
        Driver driver1 = new Driver("Anubhav", "DL123456", 4.7);
        Driver driver2 = new Driver("Ankit", "DL654321", 4.9);

        // Main class object
        UseCabbyGo app = new UseCabbyGo();

        // Ride 1
        app.bookRide(suv, driver1, 12);
        app.endRide();

        // Ride 2
        app.bookRide(mini, driver2, 5);
        app.endRide();

        // Ride 3
        app.bookRide(sedan, driver1, 8);
        app.endRide();
    }
}
