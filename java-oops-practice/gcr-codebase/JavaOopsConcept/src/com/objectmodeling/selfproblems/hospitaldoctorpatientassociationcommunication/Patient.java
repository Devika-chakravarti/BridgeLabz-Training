package com.objectmodeling.selfproblems.hospitaldoctorpatientassociationcommunication;
import java.util.ArrayList;

public class Patient {

    String name;
    ArrayList<Doctor> doctors = new ArrayList<>();

    public Patient(String name) {
        this.name = name;
    }

    // Add doctor to patient's list
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void showDoctors() {
        System.out.println("Patient " + name + " consulted:");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.name);
        }
    }
}
