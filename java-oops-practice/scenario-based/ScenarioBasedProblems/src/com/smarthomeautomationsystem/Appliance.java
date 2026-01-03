package com.smarthomeautomationsystem;

// base class for all devices
public abstract class Appliance implements Controllable{
    private String name;
    private boolean isOn;
    private int power; // watts

    public Appliance(String name,int power){
        this.name=name;
        this.power=power;
        this.isOn=false; // default off
    }

    public String getName(){ return name; }
    public int getPower(){ return power; }
    public boolean isOn(){ return isOn; }
    protected void setOn(boolean state){ isOn=state; }

    // compare power usage with another appliance
    public void comparePower(Appliance other){
        if(this.power>other.power)
            System.out.println(name+" uses more power than "+other.getName());
        else if(this.power<other.power)
            System.out.println(name+" uses less power than "+other.getName());
        else
            System.out.println(name+" and "+other.getName()+" use the same power");
    }

    // return ON/OFF status
    public String getStatus(){ return isOn?"ON":"OFF"; }
}
