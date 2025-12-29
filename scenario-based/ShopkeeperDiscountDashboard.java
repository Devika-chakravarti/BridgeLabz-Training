/*
Scenario-based problem: 8

Shopkeeper’s Discount Dashboard 
A shopkeeper gives discounts based on total bill:
- Input item prices in a for-loop.
- Use if-else for discount logic.
- Use proper indentation, constants, and comments.
*/


import java.util.*;
public class ShopkeeperDiscountDashboard{


    // Non-static method to calculate total bill after discount
    public double computingTotalBill(){

        Scanner input = new Scanner(System.in);

        // Constants for discount percentages(20%, 10%, 5%)
        final double discount20 = 0.20;
        final double discount10 = 0.10;
        final double discount5 = 0.05;

        System.out.print("Enter number of items: ");
        int numberOfItems = input.nextInt();

	// Initialize total with 0.0
        double total = 0.0;
        // Usinf for loop to take item prices from the user
        for(int i = 1; i <= numberOfItems; i++){
            System.out.print("Enter price(in rupees) of item " + i + ": ");
            double price = input.nextDouble();
            // Adding prices of the items
	    total += price;
        }

	// Initialize discount with 0
        double discount = 0.0;
        // Using if else for discount logic
        if(total >= 5000){
            discount = total * discount_20;
        } 
	else if(total >= 3000){
            discount = total * discount_10;
        } 
	else if(total >= 1000){
            discount = total * discount_5;
        }

	// Compute the final amount to pay after discount(if applicable)
        double finalAmount = total - discount;

        // Display Total bill, discount and the bill after discount(if applicable)
        System.out.println("\nTotal Bill: " + total + " Rs");
        System.out.println("Discount: " + discount + " Rs");
        System.out.println("Final Amount to Pay: " + finalAmount + " Rs");

        return finalAmount;
    }


    // Main method to call the non-static method
    public static void main(String args[]){

        System.out.println("---- SHOPKEEPER DISCOUNT DASHBOARD ----\n");

	// Create object to call the non-static method
        ShopkeeperDiscountDashboard obj = new ShopkeeperDiscountDashboard();
        obj.computingTotalBill();
    }
}
