package com.objectmodeling.selfproblems.facultydepartmentcompositionaggregation;
import java.util.ArrayList;

public class University {

    String universityName;
    ArrayList<Department> departments = new ArrayList<>();

    public University(String universityName) {
        this.universityName = universityName;
    }

    // Composition: University creates Departments
    public void addDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
    }

    public void showUniversityDetails() {
        System.out.println("University: " + universityName);
        for (Department dept : departments) {
            dept.showFaculties();
        }
    }

    // Simulate deletion of university
    public void deleteUniversity() {
        departments.clear();  // Departments removed
        System.out.println("University deleted along with all departments.");
    }
}
