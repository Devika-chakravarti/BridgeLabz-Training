package com.smarthomeautomationsystem;

public class AC extends Appliance{
    public AC(String name,int power){ super(name,power); }

    public void turnOn(){ setOn(true); }
    public void turnOff(){ setOn(false); }
}
