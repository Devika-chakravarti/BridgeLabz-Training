package com.hospitalpatientmanagementsystem;
public class Doctor{
	
	// Attributes
    private int doctorId;
    private String name;
    private String specialization;

    // Constructor
    public Doctor(int doctorId,String name,String specialization){
        this.doctorId=doctorId;
        this.name=name;
        this.specialization=specialization;
    }

    // Concrete method
    public void displayInfo(){
        System.out.println("\nDoctor: "+name+" | Specialization: "+specialization);
    }
}

