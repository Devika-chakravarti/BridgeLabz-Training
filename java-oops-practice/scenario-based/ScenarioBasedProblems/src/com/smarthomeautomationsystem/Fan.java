package com.smarthomeautomationsystem;

public class Fan extends Appliance{
    public Fan(String name,int power){ super(name,power); }

    public void turnOn(){ setOn(true); }   
    public void turnOff(){ setOn(false); }
}
