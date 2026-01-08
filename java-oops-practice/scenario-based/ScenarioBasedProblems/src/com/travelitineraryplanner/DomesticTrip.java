package com.travelitineraryplanner;

import java.util.List;

public class DomesticTrip extends Trip implements IBookable {

    public DomesticTrip(String destination, int duration, Transport transport, Hotel hotel, List<Activity> activities) {
        super(destination, duration, transport, hotel, activities);
    }

    @Override
    public void book() {
        System.out.println("\nDomestic Trip to " + destination + " booked successfully!");
    }

    @Override
    public void cancel() {
        System.out.println("\nDomestic Trip to " + destination + " cancelled.");
    }
}
