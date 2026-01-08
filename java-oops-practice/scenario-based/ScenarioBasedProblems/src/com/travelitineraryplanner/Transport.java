package com.travelitineraryplanner;

public class Transport {
    private String type;
    private double cost;

    public Transport(String type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }
}
