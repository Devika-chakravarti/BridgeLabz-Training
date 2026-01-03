/* Scenario-based: 1
 * 
 *  Hospital Patient Management System
Scenario: A hospital wants a software module to register patients, assign doctors, and maintain
billing.
Concepts Used:
● Class: Patient, Doctor, Bill
● Constructor: Overloaded for emergency vs. normal patient admission
● Access Modifiers: Keep sensitive data like medicalHistory as private, expose
getSummary() via public
● Interface: Payable with method calculatePayment() implemented in Bill
● Operators: Used to compute discounts, taxes, totals
● OOP:
○ Encapsulation: Private fields with getter/setters
○ Abstraction: Hide billing calculation behind interface
○ Inheritance: InPatient, OutPatient extend Patient
○ Polymorphism: displayInfo() overridden for Doctor, Patient, etc.*/


package com.hospitalpatientmanagementsystem;
public class UseHospitalManagementSystem{
    public static void main(String[] args){
    	
    	System.out.println("--------- Hospital management system ---------");
        Patient p1=new InPatient(101,"Devika","Diabetes",5);
        Patient p2=new OutPatient(102,"Anjali","Fever","10-12-2025");

        Doctor d1=new Doctor(1,"Dr.Sharma","Cardiology");

        Bill bill=new Bill(5000,0.05,0.10);

        p1.displayInfo();
        p2.displayInfo();
        
        System.out.print("-----------------------------------------------");
        d1.displayInfo();

        System.out.print("-----------------------------------------------");
        System.out.println("\nTotal Bill Amount:"+bill.calculatePayment());
    }
}
