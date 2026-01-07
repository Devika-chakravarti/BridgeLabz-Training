/* Scenario-based: 14
 * 
 * "LoanBuddy – Loan Approval Automation"
Story: A fintech startup named FinlyTech is launching a product called LoanBuddy, a web and
mobile app that automates personal loan approvals for salaried and self-employed applicants.
LoanBuddy should collect applicant data, verify eligibility, evaluate credit risk, and either
approve or reject the loan based on custom rules. It also calculates monthly EMIs and provides
a personalized repayment plan.
You’re hired as a Java backend developer to design and implement the core loan approval
engine.
Requirements:
● Applicant class: name, creditScore, income, loanAmount.
● LoanApplication class with loan type, term, and interest rate.
● Interface IApprovable with approveLoan() and calculateEMI().
● Use constructors to support different types of loans (personal, home, auto).
● Operators for EMI calculation: P × R × (1+R)^N / ((1+R)^N – 1)
● Encapsulation: keep credit score and internal approval logic private.
● Inheritance: different loan types (HomeLoan, AutoLoan) extending base class.
● Polymorphism: EMI calculation logic varies by loan type.
● Access modifiers to limit loan status changes to internal processes only.

 * */

package com.loanapprovalautomation;

import java.util.Scanner;

public class UseLoanApprovalAutomation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("     WELCOME TO LOANBUDDY");
        System.out.println("=====================================");

        // Applicant details
        System.out.print("Enter Applicant Name       : ");
        String name = input.nextLine();

        System.out.print("Enter Credit Score         : ");
        int creditScore = input.nextInt();

        System.out.print("Enter Monthly Income       : ");
        double income = input.nextDouble();

        System.out.print("Enter Loan Amount          : ");
        double loanAmount = input.nextDouble();

        Applicant applicant = new Applicant(name, creditScore, income, loanAmount);

        System.out.println("\nChoose Loan Type:");
        System.out.println("1. Home Loan");
        System.out.println("2. Auto Loan");
        System.out.print("Enter choice (1-2)         : ");
        int loanChoice = input.nextInt();

        System.out.print("Enter Loan Term (months)   : ");
        int term = input.nextInt();

        LoanApplication loan = null;

        if (loanChoice == 1) {
            loan = new HomeLoan(applicant, term);
        } else if (loanChoice == 2) {
            loan = new AutoLoan(applicant, term);
        } else {
            System.out.println("Invalid loan type selected.");
            input.close();
            return;
        }

        boolean approved = loan.approveLoan();

        System.out.println("-------------------------------------");
        System.out.println("Loan Status : " + (approved ? "APPROVED" : "REJECTED"));

        if (approved) {
            System.out.println("Monthly EMI : " + loan.calculateEMI());
        }

        System.out.println("-------------------------------------");
        System.out.println("Thank you for using LoanBuddy");
        System.out.println("=====================================");

        input.close();
    }
}
