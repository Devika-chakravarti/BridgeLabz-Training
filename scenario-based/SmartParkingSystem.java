/*
Scenario-based problem: 6

Parking Lot Gate System:
Develop a smart parking system.
- Options: Park, Exit, Show Occupancy
- Use switch-case for the menu.
- while loop to continue until the parking lot is full or the user exits.
*/


import java.util.*;
public class SmartParkingSystem{

    // Non-static method to handle parking operations
    public void checkParking(){

        Scanner input = new Scanner(System.in);

	// Fixed parking capacity
        int availableSpace = 5;  
	// Initially the space isn't occupied 
        int occupied = 0;
	// Storing the choice of the user
        int choice;

	// Using while with true to have infinite loop until a specific condition meets (i.e parking full)
        while(true){
            System.out.println("\nParking Menu:");
            System.out.println("1. Park");
            System.out.println("2. Exit");
            System.out.println("3. Show Occupancy");
            System.out.print("Enter your choice(1/2/3): ");
            choice = input.nextInt();

            switch(choice){
                case 1:
                    if(occupied < availableSpace){
                        occupied++;
                        System.out.println("Vehicle parked successfully");
                    }
 		    else{
                        System.out.println("\nPARKING FULL!");
                        return; 
                    }
                    break;
                case 2:
                    if(occupied > 0){
                        occupied--;
                        System.out.println("Vehicle exited successfully");
                    }
		    else{
                        System.out.println("No vehicles to exit");
                    }
                    break;
                case 3:
                    System.out.println("Occupied Spaces: " + occupied);
                    System.out.println("Available Spaces: " + (availableSpace - occupied));
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    // Main method to call the non-static method and display the result
    public static void main(String args[]){

	System.out.print("--- Welcome to our Parking Lot Gate System ---\n");
	
        SmartParkingSystem obj = new SmartParkingSystem();
        obj.checkParking();
    }
}
