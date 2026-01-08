package com.travelitineraryplanner;

import java.util.List;

public class InternationalTrip extends Trip implements IBookable {

    public InternationalTrip(String destination, int duration, Transport transport, Hotel hotel, List<Activity> activities) {
        super(destination, duration, transport, hotel, activities);
        // International trips may have additional taxes or fees
        this.budget *= 0.15; // 15% extra for international
    }

    @Override
    public void book() {
        System.out.println("\nInternational Trip to " + destination + " booked successfully!");
    }

    @Override
    public void cancel() {
        System.out.println("\nInternational Trip to " + destination + " cancelled.");
    }
}
