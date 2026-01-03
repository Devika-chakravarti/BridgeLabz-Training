/* Scenario-based: 5
 * 
 * Smart Home Automation System
Scenario: Users can control appliances like lights, fans, ACs via a smart interface.
Concepts Used:
● Class: Appliance, Light, Fan, AC, UserController

Scenario-based Problems

● Constructor: Set default or user-defined power settings
● Access Modifiers: Internal device settings as private, toggle methods as public
● Interface: Controllable with methods turnOn(), turnOff()
● Operators: Compare energy usage (>, <, ==)
● OOP:
○ Encapsulation: Control internal appliance state
○ Abstraction: Devices follow common control interface
○ Inheritance: Device types inherit from Appliance
○ Polymorphism: Turning on a Light vs an AC involves different behaviors
 * */

package com.smarthomeautomationsystem;
import java.util.ArrayList;
import java.util.List;

public class UseSmartHomeAutomationSystem{
    public static void main(String[] args){
        
        Light livingLight=new Light("Living Room Light",60);
        Fan ceilingFan=new Fan("Ceiling Fan",75);
        AC bedroomAC=new AC("Bedroom AC",1200);

        // add all devices to list
        List<Appliance> devices=new ArrayList<>();
        devices.add(livingLight);
        devices.add(ceilingFan);
        devices.add(bedroomAC);

        // create user controller
        UserController devika=new UserController("Devika");

        // set devices ON/OFF
        devika.controlDevice(livingLight,false);
        devika.controlDevice(ceilingFan,false);
        devika.controlDevice(bedroomAC,true);

        devika.printDashboard(devices);
    }
}
