import java.util.*;
public class EmployeeBonusCalculator{


    // Method to generate salary (5-digit) and years of service (1-10) for 10 employees
    public static int[][] generateEmployeeData(int numEmployees){
	// Array has two columns for Salary and years of service
        int[][] data = new int[numEmployees][2]; 
        for(int i = 0; i < numEmployees; i++){
	    // for salary
            data[i][0] = (int)(Math.random() * 90000) + 10000;
	    // for years of service 
            data[i][1] = (int)(Math.random() * 10) + 1;        
        }
        return data;
    }


    // Method to calculate new salary and bonus
    public static double[][] calculateNewSalaryAndBonus(int[][] employeeData){
	// Array has two columns New salary and bonus
        double[][] newData = new double[employeeData.length][2]; 
        for(int i = 0; i < employeeData.length; i++){
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
	    // 5% if >5 years, 2% if <=5 years
            double bonusPercent = (years > 5) ? 0.05 : 0.02; 
            double bonus = salary * bonusPercent;
            double newSalary = salary + bonus;

            newData[i][0] = newSalary;
            newData[i][1] = bonus;
        }
        return newData;
    }


    // Method to display results in a simple format
    public static void displayResults(int[][] employeeData, double[][] newData){
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Old Salary\tYears\tBonus\tNew Salary");

        for(int i = 0; i < employeeData.length; i++){
            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

	    // sum of old and new salary and total bonus amount
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.println(oldSalary + "\t\t" + years + "\t" + 
                               String.format("%.2f", bonus) + "\t" + 
                               String.format("%.2f", newSalary));
        }

        System.out.println("Total:\t\t-\t" + String.format("%.2f", totalBonus) + " " + String.format("%.2f", totalNewSalary));
    }


    // Main method to display the result 
    public static void main(String[] args){
        int numEmployees = 10;

        int[][] employeeData = generateEmployeeData(numEmployees);
        double[][] newData = calculateNewSalaryAndBonus(employeeData);
        displayResults(employeeData, newData);
    }


}
