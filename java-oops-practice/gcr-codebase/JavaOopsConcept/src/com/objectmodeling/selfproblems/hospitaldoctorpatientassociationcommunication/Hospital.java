package com.objectmodeling.selfproblems.hospitaldoctorpatientassociationcommunication;
import java.util.ArrayList;

public class Hospital {

    String hospitalName;
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showHospitalDetails() {
        System.out.println("Hospital: " + hospitalName);

        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println("- " + d.name);
        }

        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}
