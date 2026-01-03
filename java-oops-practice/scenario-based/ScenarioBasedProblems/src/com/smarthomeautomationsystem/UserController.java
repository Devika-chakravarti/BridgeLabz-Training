package com.smarthomeautomationsystem;
import java.util.List;

public class UserController{
    private String userName;

    public UserController(String userName){ this.userName=userName; }

    // switch device on/off
    public void controlDevice(Controllable device, boolean on){
        if(on) device.turnOn();
        else device.turnOff();
    }

    // print dashboard of all devices
    public void printDashboard(List<Appliance> devices){
        System.out.println("---------------- Smart Home Status ----------------");
        System.out.printf("%-18s %-8s %-10s\n","Device","Status","Power(W)");
        System.out.println("---------------------------------------------------");

        for(Appliance a : devices){
            System.out.printf("%-18s %-8s %-10d\n",a.getName(),a.getStatus(),a.getPower());
        }

        System.out.println("---------------------------------------------------");
        System.out.println("Power Comparisons:");
        for(int i=0;i<devices.size()-1;i++){
            devices.get(i).comparePower(devices.get(i+1));
        }
        System.out.println("---------------------------------------------------");
    }
}
