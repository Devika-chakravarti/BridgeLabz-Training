/*Smart Vehicle Dashboard
○ Scenario: All vehicles have a method displaySpeed(), but electric vehicles
also display battery percentage.
○ Task: Use default methods to add this new feature.*/

package com.interfaces.usingdefaultmethods.smartvehicledashboard;

public class DashboardApp {
    public static void main(String[] args) {

        VehicleDashboard petrol = new PetrolCar();
        VehicleDashboard electric = new ElectricCar();

        petrol.displaySpeed();
        petrol.displayBatteryStatus();

        electric.displaySpeed();
        electric.displayBatteryStatus();
    }
}
