package com.encapsulationpolymorphismandabstraction.hospitalpatientmanagement;

import java.util.ArrayList;

public class UseHospitalManagementSystem {

    public static void main(String[] args) {

        ArrayList<Patient> patients = new ArrayList<>();

        patients.add(new InPatient("P101", "Vikky", 35, 5, 2000));
        patients.add(new OutPatient("P102", "Shanu", 28, 500));

        processPatients(patients);
    }

    public static void processPatients(ArrayList<Patient> patients) {

        for (int i = 0; i < patients.size(); i++) {

            Patient patient = patients.get(i);

            patient.getPatientDetails();
            patient.handleMedicalRecord("Routine Checkup");

            System.out.println("Total Bill: " + patient.calculateBill());
            patient.viewMedicalRecord();

            System.out.println("----------------------------------");
        }
    }
}
