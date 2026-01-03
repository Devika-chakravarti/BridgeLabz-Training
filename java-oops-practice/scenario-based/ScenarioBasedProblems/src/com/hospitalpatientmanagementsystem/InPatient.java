package com.hospitalpatientmanagementsystem;
public class InPatient extends Patient{
    private int daysAdmitted;

    public InPatient(int patientId,String name,String medicalHistory,int daysAdmitted){
        super(patientId,name,medicalHistory);
        this.daysAdmitted=daysAdmitted;
    }

    @Override
    public void displayInfo(){
        System.out.println("InPatient: "+getSummary()+"\nDays:"+daysAdmitted);
    }
}
