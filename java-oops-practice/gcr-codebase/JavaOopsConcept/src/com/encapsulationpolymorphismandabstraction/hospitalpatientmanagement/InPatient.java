package com.encapsulationpolymorphismandabstraction.hospitalpatientmanagement;

public class InPatient extends Patient implements MedicalRecord {

	// Attributes
    private int daysAdmitted;
    private double dailyCharge;
    private String medicalRecord;

    // Constructor
    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    @Override
    public void addRecord(String record) {
        this.medicalRecord = record;
        setDiagnosis(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Record: " + medicalRecord);
    }

    @Override
    public void handleMedicalRecord(String record) {
        addRecord(record);
    }

    @Override
    public void viewMedicalRecord() {
        viewRecords();
    }
}
