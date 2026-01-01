package com.objectmodeling.selfproblems.facultydepartmentcompositionaggregation;

public class UseUniversity {
	public static void main(String[] args) {

        // Create University
        University uni = new University("Global Tech University");

        // Add departments
        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical");

        // Create faculty (independent objects)
        Faculty f1 = new Faculty("Dr. Sharma", "AI");
        Faculty f2 = new Faculty("Dr. Mehta", "Thermodynamics");

        // Add faculty to departments
        uni.departments.get(0).addFaculty(f1);
        uni.departments.get(1).addFaculty(f2);

        // Show university structure
        uni.showUniversityDetails();

        System.out.println("\nDeleting university!");

        // Delete university
        uni.deleteUniversity();

        // Faculty still exists
        System.out.println("Faculty still exists independently:");
        f1.showFaculty();
        f2.showFaculty();
    }
}
