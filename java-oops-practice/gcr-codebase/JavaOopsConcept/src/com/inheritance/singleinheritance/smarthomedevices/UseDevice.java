package com.inheritance.singleinheritance.smarthomedevices;

public class UseDevice {
	public static void main(String[] args) {

        Thermostat thermostat = new Thermostat(101, "ON", 24);
        thermostat.displayStatus();
    }
}
