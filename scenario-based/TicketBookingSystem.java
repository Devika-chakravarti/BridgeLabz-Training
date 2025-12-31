/*
Scenario-based problem: 12

Train Reservation Queue
Simulate a basic ticket booking system.
- Show menu with switch
- Allow multiple bookings using while-loop.
- Stop booking once seats reach zero (break).
*/


import java.util.*;
public class TicketBookingSystem{

    // Non-static method to handle parking operations
    public void bookTickets(){

        Scanner input = new Scanner(System.in);

	// Fixed seats availability
        int availableSeats = 5;  
	// Initially the seats isn't occupied 
        int occupied = 0;
	// Storing the choice of the user
        int choice;

	// Using while with true to have infinite loop until a specific condition meets (i.e all seats are booked)
        while(true){
            System.out.print("---------------------------------------------");
	    System.out.println("\nSeat booking Menu (available seats are 5):");
	    System.out.println("---------------------------------------------");
	    System.out.println(" ");
            System.out.println("1. Book seats");
            System.out.println("2. Cancel seats");
            System.out.println("3. Show booked seats");
	    System.out.println("4. Exit from the system");
	    System.out.println(" ");
            System.out.print("Enter your choice(1/2/3/4): ");
            choice = input.nextInt();

            switch(choice){
                case 1:
                    if(occupied < availableSeats){
                        occupied++;
                        System.out.println("Seats booked successfully!!\n");
                    }
 		    else{
                        System.out.println("\nALL SEATS ARE FULL!");
                        return; 
                    }
                    break;
                case 2:
                    if(occupied > 0){
                        occupied--;
                        System.out.println("Ticket canceled successfully!!\n");
                    }
		    else{
                        System.out.println("No seats to cancel");
                    }
                    break;
                case 3:
		    System.out.println("---------------------------------------------");
                    System.out.println("Occupied Spaces: " + occupied);
                    System.out.println("Available Spaces: " + (availableSeats - occupied));
                    System.out.println("---------------------------------------------");
		    break;
		case 4:
		    System.out.println(" ");
		    System.out.println("THANKYOU! for using our ticket booking system");
		    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    // Main method to call the non-static method and display the result
    public static void main(String args[]){

	System.out.println(" ");
	System.out.print("--- WELCOME TO OUR TICKET BOOKING SYSTEM ---\n");
	
        TicketBookingSystem obj = new TicketBookingSystem();
        obj.bookTickets();
    }
	
}