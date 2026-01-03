package com.hospitalpatientmanagementsystem;
public abstract class Patient{
	
	// Attributes
    protected int patientId;
    protected String name;
    private String medicalHistory;

    // Constructor
    public Patient(int patientId,String name,String medicalHistory){
        this.patientId=patientId;
        this.name=name;
        this.medicalHistory=medicalHistory;
    }

    // Concrete method
    public String getSummary(){
        return "\nPatient ID:"+patientId+"\nName:"+name;
    }

    // Abstract method
    public abstract void displayInfo();
}
