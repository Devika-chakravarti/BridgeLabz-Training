package com.loanapprovalautomation;

public class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, int term) {
    	// 8% interest for home loan
        super(applicant, term, 0.08); 
    }

    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 700 && applicant.income >= 50000) {
            setLoanStatus(true);
        } else {
            setLoanStatus(false);
        }
        return loanStatus;
    }

    @Override
    public double calculateEMI() {
        double P = applicant.loanAmount;
        double R = interestRate / 12;
        int N = term;

        // formula to calculate EMI
        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }
}
