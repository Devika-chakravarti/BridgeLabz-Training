/*
Scenario-based problem: 14

Movie Ticket Booking App 
Ask users for movie type, seat type (gold/silver), and snacks.
- Use switch and if together.
- Loop through multiple customers.
- Clean structure and helpful variable names.
*/


import java.util.*;
public class MovieTicketBookingApp{

	int totalSeats=100;
	int bookedSeats=0;
	int goldSeats=70;
	int silverSeats=30;

	// Show main menu
	public void showMainMenu(){
		System.out.println("\nMOVIE TICKET BOOKING:");
		System.out.println("1. Book Movie Ticket");
		System.out.println("2. Show Available Seats");
		System.out.println("3. Exit");
		System.out.print("Enter your choice(1/2/3): ");
	}

	// Show movie types
	public void showMovieType(){
		System.out.println("\nCHOOSE YOUR MOVIE TYPE:");
		System.out.println("1. Horror");
		System.out.println("2. Science Fiction");
		System.out.println("3. Thriller");
		System.out.println("4. Romantic");
		System.out.println("5. Action");
		System.out.println("6. Documentary");
		System.out.println("7. Animation");
		System.out.println("8. Rom-Com");
		System.out.print("Enter your movie type(1/2/3/4/5/6/7/8): ");
	}

	// Show seat types
	public void showSeatType(){
		System.out.println("\nCHOOSE YOUR SEAT TYPE:");
		System.out.println("1. Gold");
		System.out.println("2. Silver");
		System.out.print("Enter your seat type(1/2): ");
	}

	// Show snacks
	public void showSnacksMenu(){
		System.out.println("\nCHOOSE YOUR SNACK:");
		System.out.println("1. Popcorn");
		System.out.println("2. Nachos");
		System.out.println("3. Pizza");
		System.out.println("4. Hot Dogs");
		System.out.println("5. Fries");
		System.out.println("6. Cold drinks");
		System.out.print("Enter your choice(1-6): ");
	}

	// Booking logic
	public void bookTicket(Scanner input){
		if(bookedSeats==totalSeats){
			System.out.println("ALL SEATS ARE BOOKED!");
			return;
		}

		showMovieType();
		int movieChoice=input.nextInt();

		switch(movieChoice){
			case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:
				break;
			default:
				System.out.println("Invalid movie type!!");
				return;
		}

		showSeatType();
		int seatChoice=input.nextInt();

		if(seatChoice==1){
			if(goldSeats>0){
				goldSeats--;
				bookedSeats++;
			}else{
				System.out.println("Sorry, Gold seats not available");
				return;
			}
		}else if(seatChoice==2){
			if(silverSeats>0){
				silverSeats--;
				bookedSeats++;
			}else{
				System.out.println("Sorry, Silver seats not available");
				return;
			}
		}else{
			System.out.println("Invalid seat type!!");
			return;
		}

		showSnacksMenu();
		int snackChoice=input.nextInt();

		if(snackChoice<1||snackChoice>6){
			System.out.println("Invalid snack choice!!");
			return;
		}

		System.out.println("TICKET BOOKED SUCCESSFULLY!");
	}

	// Show remaining seats
	public void showAvailableSeats(){
		System.out.println("AVAILABLE SEATS:");
		System.out.println("Gold seats: "+goldSeats);
		System.out.println("Silver seats: "+silverSeats);
		System.out.println("Total remaining seats: "+(totalSeats-bookedSeats));
	}

	// Main method takes input from user and to create object to call the non-static methods
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);

		System.out.println("--------------------------------------------");
		System.out.println("  WELCOME TO OUR MOVIE TICKET BOOKING APP  ");
		System.out.println("--------------------------------------------");
	
		MovieTicketBookingApp app=new MovieTicketBookingApp();

		while(true){
			app.showMainMenu();
			int choice=input.nextInt();

			switch(choice){
				case 1:
					app.bookTicket(input);
					break;
				case 2:
					app.showAvailableSeats();
					break;
				case 3:
					System.out.println("\nTHANKYOU! for using our app");
					return;
				default:
					System.out.println("Invalid choice!!");
			}
		}
	}
}
