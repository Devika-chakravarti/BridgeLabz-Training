package com.hospitalpatientmanagementsystem;
public class Bill implements Payable{
	
	// Attributes
    private double amount;
    private double tax;
    private double discount;

    // Constructor
    public Bill(double amount,double tax,double discount){
        this.amount=amount;
        this.tax=tax;
        this.discount=discount;
    }

    @Override
    public double calculatePayment(){
        return amount+(amount*tax)-(amount*discount);
    }
}
