package com.objectmodeling.selfproblems.hospitaldoctorpatientassociationcommunication;

public class UseHospital {
	public static void main(String[] args) {

        // Create hospital
        Hospital hospital = new Hospital("City Care Hospital");

        // Create doctors
        Doctor d1 = new Doctor("Sharma");
        Doctor d2 = new Doctor("Verma");

        // Create patients
        Patient p1 = new Patient("Amit");
        Patient p2 = new Patient("Neha");

        // Add doctors and patients to hospital
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        // Consultations (association + communication)
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        System.out.println();

        // Display details
        hospital.showHospitalDetails();

        System.out.println();
        d1.showPatients();
        d2.showPatients();

        System.out.println();
        p1.showDoctors();
        p2.showDoctors();
    }
}
