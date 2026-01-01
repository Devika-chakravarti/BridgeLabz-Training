package com.objectmodeling.assistedproblems.companydepartmentcomposition;

public class CompanyDepartmentComposition {
	public static void main(String[] args) {

        // Create company
        Company company = new Company("Tech Solutions");

        // Add departments
        company.addDepartment("Development");
        company.addDepartment("HR");

        // Add employees to departments
        company.departments.get(0).addEmployee("Ram", "Java Developer");
        company.departments.get(0).addEmployee("Sita", "Frontend Developer");

        company.departments.get(1).addEmployee("Ravi", "HR Manager");

        // Display full structure
        company.showCompanyDetails();
    }
}
