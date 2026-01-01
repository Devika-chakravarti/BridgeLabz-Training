package com.inheritance.singleinheritance.smarthomedevices;
class Thermostat extends Device {

    private int temperatureSetting;

    public Thermostat(int deviceId, String status, int temperatureSetting) {
        super(deviceId, status); // calling parent constructor
        this.temperatureSetting = temperatureSetting;
    }

    // overriding displayStatus method
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
