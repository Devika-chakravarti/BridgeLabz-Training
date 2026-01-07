package com.loanapprovalautomation;

public class Applicant {

    protected String name;
    private int creditScore;   
    protected double income;
    protected double loanAmount;

    public Applicant(String name, int creditScore, double income, double loanAmount) {
        this.name = name;
        this.creditScore = creditScore;
        this.income = income;
        this.loanAmount = loanAmount;
    }

    public int getCreditScore() {
        return creditScore;
    }
}
