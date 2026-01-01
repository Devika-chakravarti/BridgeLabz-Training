package com.objectmodeling.assistedproblems.companydepartmentcomposition;
import java.util.ArrayList;
public class Company {
	String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    public Company(String companyName) {
        this.companyName = companyName;
    }

    // Create and add department
    public void addDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
    }

    public void showCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.showEmployees();
        }
    }
}
