package com.hospitalpatientmanagementsystem;
public class OutPatient extends Patient{
    private String visitDate;

    public OutPatient(int patientId,String name,String medicalHistory,String visitDate){
        super(patientId,name,medicalHistory);
        this.visitDate=visitDate;
    }

    @Override
    public void displayInfo(){
        System.out.println("\nOutPatient: "+getSummary()+"\nVisit Date:"+visitDate);
    }
}
