import java.util.*;
public class MetroSmartCardFareDeduction{

    // Non-static method to calculate fare using ternary operator
    public int calculateFare(int distance){
        int fare = (distance <= 5) ? 10 : (distance <= 10) ? 20 : 30;
        return fare;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create object to call the non-static method
        MetroSmartCardFareDeduction metro = new MetroSmartCardFareDeduction();

        // Initial smart card balance
        int balance = 100;
        System.out.println("Welcome to Delhi Metro!");
        System.out.println("Your starting balance is: " + balance + "Rs");

	// Keep taking input distance from user until user enters -1
        while(true){
            System.out.print("\nEnter distance to travel(or -1 to quit): ");
            int distance = input.nextInt();

            if (distance == -1) {
                System.out.println("Thank you! Exiting Metro System");
                break;
            }

	    // Calls the non-static method and store it's value in fare variable
            int fare = metro.calculateFare(distance);

            if(fare > balance){
                System.out.println("Insufficient balance! Your balance: " + balance + "Rs");
                System.out.println("Please recharge your card");
                break;
            }

            balance -= fare;
            System.out.println("Fare for " + distance + " km: " + fare + "Rs");
            System.out.println("Remaining balance: " + balance + "Rs");

            if(balance == 0){
                System.out.println("Your balance is zero. Please recharge to continue");
                break;
            }
        }
        System.out.println("Final balance: " + balance + "Rs");
	input.close();
    }
}
