package com.objectmodeling.selfproblems.facultydepartmentcompositionaggregation;
import java.util.ArrayList;

public class Department {

    String departmentName;
    ArrayList<Faculty> faculties = new ArrayList<>();

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    // Add faculty (aggregation)
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showFaculties() {
        System.out.println("Department: " + departmentName);
        for (Faculty f : faculties) {
            f.showFaculty();
        }
    }
}
