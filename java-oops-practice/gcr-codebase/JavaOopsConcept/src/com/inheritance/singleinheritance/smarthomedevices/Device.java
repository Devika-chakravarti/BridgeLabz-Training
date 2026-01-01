package com.inheritance.singleinheritance.smarthomedevices;
class Device {

    // private attributes
    private int deviceId;
    private String status;

    // constructor to initialize device details
    public Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // getters to access private data
    public int getDeviceId() {
        return deviceId;
    }

    public String getStatus() {
        return status;
    }

    // method to display device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}
