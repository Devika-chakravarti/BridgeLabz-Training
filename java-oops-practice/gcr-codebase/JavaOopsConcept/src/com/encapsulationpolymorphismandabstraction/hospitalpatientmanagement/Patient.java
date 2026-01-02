package com.encapsulationpolymorphismandabstraction.hospitalpatientmanagement;

public abstract class Patient {

	// Attributes
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;

    // Constructor
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Setters
    protected void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    // Getters
    protected String getDiagnosis() {
        return diagnosis;
    }

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Abstract method
    public abstract double calculateBill();

    public abstract void handleMedicalRecord(String record);

    public abstract void viewMedicalRecord();
}
