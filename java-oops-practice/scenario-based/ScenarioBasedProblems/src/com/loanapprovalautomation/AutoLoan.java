package com.loanapprovalautomation;

public class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int term) {
        super(applicant, term, 0.10); // 10% interest
    }

    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 650 && applicant.income >= 30000) {
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

        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }
}
