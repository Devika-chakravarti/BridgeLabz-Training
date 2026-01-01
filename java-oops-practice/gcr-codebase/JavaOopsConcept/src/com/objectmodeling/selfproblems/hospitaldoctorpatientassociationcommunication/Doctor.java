package com.objectmodeling.selfproblems.hospitaldoctorpatientassociationcommunication;
import java.util.ArrayList;

public class Doctor {

    String name;
    ArrayList<Patient> patients = new ArrayList<>();

    public Doctor(String name) {
        this.name = name;
    }

    // Communication method
    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting patient " + patient.name);

        // Association both ways
        patients.add(patient);
        patient.addDoctor(this);
    }

    public void showPatients() {
        System.out.println("Dr. " + name + " has consulted:");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}
