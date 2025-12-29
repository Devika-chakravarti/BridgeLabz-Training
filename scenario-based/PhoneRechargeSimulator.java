/*
Scenario-based problem: 10

Phone Recharge Simulator 
Take the user's mobile operator and amount.
- Use a switch to display offers.
- Loop to allow repeated recharges.
- Show balance after each recharge.
*/


import java.util.*;
public class PhoneRechargeSimulator{

    // This method handles the complete recharge process
    public void rechargeProcess(){

        Scanner input = new Scanner(System.in);
        double balance = 0;
        String choice;

        do{
            System.out.println("\n------------ Phone Recharge ------------\n");

            // Showing available operators to the user
            System.out.println("Available Mobile Operators:");
            System.out.println("1. Jio");
            System.out.println("2. Airtel");
            System.out.println("3. VI");
            System.out.println("4. BSNL");
            System.out.println("5. Vodafone");
            System.out.println("6. Idea");

            System.out.print("\nEnter your mobile operator name: ");
            String operator = input.nextLine().trim();

            System.out.print("Enter recharge amount: ");
            double amount = input.nextDouble();
            input.nextLine(); 

            // Using switch case for showing offers based on selected operator
	    // Showing offers based on selected operator
	    // Balance only be increased if the user enters the correct operator
	    switch(operator.toLowerCase()){

    		case "jio":
       			System.out.println("Offer: 1.5GB/day for 28 days");
        		balance += amount;
        		break;

    		case "airtel":
        		System.out.println("Offer: Unlimited calls + 2GB/day");
       	 		balance += amount;
        		break;

    		case "vi":
        		System.out.println("Offer: Weekend data rollover");
        		balance += amount;
        		break;

    		case "bsnl":
        		System.out.println("Offer: 1GB/day + Free SMS");
        		balance += amount;
        		break;

    		case "vodafone":
        		System.out.println("Offer: Unlimited calls + 1.5GB/day");
        		balance += amount;
        		break;

    		case "idea":
        		System.out.println("Offer: 2GB/day for 24 days");
        		balance += amount;
        		break;

    		default:
        		System.out.println("Invalid operator selected!!!");
       	 		break;
	    }            

            // Showing updated balance
            System.out.println("Current Balance: " + balance + " Rs");

            // Asking user if they want to continue
            System.out.print("\nDo you want to recharge again? (yes/no): ");
            choice = input.nextLine().trim();

        } 
	while(choice.equalsIgnoreCase("yes"));

        System.out.println("\nTHANKYOU! for using our Phone Recharge Simulator");
    }

    // Main method to call the non-static method
    public static void main(String[] args){
        PhoneRechargeSimulator simulator = new PhoneRechargeSimulator();
        simulator.rechargeProcess();
    }
}
