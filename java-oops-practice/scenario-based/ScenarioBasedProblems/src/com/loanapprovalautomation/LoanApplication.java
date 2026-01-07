package com.loanapprovalautomation;

public abstract class LoanApplication implements IApprovable {

    protected Applicant applicant;
    protected int term;           // in months
    protected double interestRate;
    protected boolean loanStatus; 

    public LoanApplication(Applicant applicant, int term, double interestRate) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
    }

    protected void setLoanStatus(boolean status) {
        this.loanStatus = status;
    }

    public boolean getLoanStatus() {
        return loanStatus;
    }
}
