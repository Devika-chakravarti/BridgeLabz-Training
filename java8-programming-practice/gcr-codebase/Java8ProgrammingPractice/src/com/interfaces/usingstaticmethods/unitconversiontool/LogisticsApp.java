/*Unit Conversion Tool
○ Scenario: Logistics software needs standard unit conversions (km to miles, kg to
lbs).
○ Task: Implement conversions as static interface methods.*/

package com.interfaces.usingstaticmethods.unitconversiontool;

public class LogisticsApp {
    public static void main(String[] args) {

        double distanceKm = 120;
        double weightKg = 50;

        double miles = UnitConverter.kmToMiles(distanceKm);
        double pounds = UnitConverter.kgToPounds(weightKg);

        System.out.println(distanceKm + " km = " + miles + " miles");
        System.out.println(weightKg + " kg = " + pounds + " lbs");
    }
}
