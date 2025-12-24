import java.util.*;
public class CoffeeCounter{

    // Method to calculate and print bill
    public void calculateBill(String coffeeType,int quantity){
	    // Initialize price to be 0 at first
        double price = 0;

        // Coffee prices
        switch(coffeeType){
            case "Espresso":
                price = 120;
                break;
            case "Latte":
                price = 150;
                break;
            case "Cappuccino":
                price = 180;
                break;
            default:
                System.out.println("Invalid coffee type!!!");
                return;
        }

	    // Total amount calculation is simple 
        double total = price * quantity;
	    // 5% GST
        double gst = total * 0.05; 
	    // Final total will be total amount calcukated with the gst  
        double finalAmount = total + gst;

	    // Displaying results
        System.out.println("Total Price: " + total + " Rs");
        System.out.println("GST: " + gst + " Rs");
        System.out.println("Final Amount: " + finalAmount + " Rs");
    }


    // Main method to take input choice of the coffee and call the non-static method calculateBill() 
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        CoffeeCounter obj = new CoffeeCounter();

	    System.out.println("Welcome to Ravi's Coffee Cafe!");

	    // Infinite while loop to keep asking user for their choice of coffee until and unless they type exit and also taking input the quantity from user
        while(true){

            System.out.print("\nEnter coffee type (Espresso/Latte/Cappuccino) or exit: ");
            String coffeeType = input.nextLine();

            // whenever the user types exit or EXIT or ExIT or in any cases, it will get ignored due to use of equalsIgnoreCase()
            if(coffeeType.equalsIgnoreCase("exit")){
                System.out.println("\nThank you! Visit again for best coffees");
                break;
            }

            // Take input quantity
            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();
            input.nextLine(); 

	        // Keep calling non static method and passing arguments
            obj.calculateBill(coffeeType,quantity);
        }

        input.close();
    }


}
