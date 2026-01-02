package com.encapsulationpolymorphismandabstraction.hospitalpatientmanagement;

public class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;
    private String medicalRecord;

    // Constructor
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
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
