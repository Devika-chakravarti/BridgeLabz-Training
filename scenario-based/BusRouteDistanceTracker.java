/*
Scenario-based problem: 19

Bus Route Distance Tracker 
Each stop adds distance.
- Ask if the passenger wants to get off at a stop.
- Use a while-loop with a total distance tracker.
- Exit on user confirmation.
*/



import java.util.*;
public class BusRouteDistanceTracker{

	// Non-static method to simulate bus stops and track distance
	public void startJourney(){
		// Scanner object to take user input
		Scanner input = new Scanner(System.in);

		// tracks total distance traveled
		int totalDistance = 0;

		// stores user's response at each stop
		char getOff;

		// Heading
		System.out.println(" ");
		System.out.println("   WELCOME TO OUR BUS ROUTE DISTANCE TRACKER   ");
		System.out.println("------------------------------------------------");

		// Array of distances for each stop in kilometers 
		int stopDistances[] = {5,10,15,20,25,30,35}; 

		// To track current stop
		int stopNumber = 0; 

		// while loop to continue the journey until passenger gets off or bus route ends
		while(stopNumber < stopDistances.length){
			// Add distance of the current stop to total distance
			totalDistance += stopDistances[stopNumber];

			// Display current stop and distance
			System.out.println("\nStop "+(stopNumber+1)+" reached.\nDistance from previous stop: "+stopDistances[stopNumber]+" km");
			System.out.println("Total distance traveled: "+totalDistance+" km");

			// Ask passenger if they want to get off
			System.out.println(" ");
			System.out.print("Do you want to get off here? (y/n): ");
			getOff = input.next().charAt(0);

			// If passenger wants to get off then exit the journey
			if(getOff == 'y' || getOff == 'Y'){
				System.out.println(" ");
				System.out.println("You got off at Stop "+(stopNumber+1)+"."+"\nTotal distance traveled: "+totalDistance+" km");
				break;
			}

			// Move to next stop
			stopNumber++;
		}

		// If bus completes all stops and passenger hasn't gotten off
		if(stopNumber == stopDistances.length){
			System.out.println("\nBus route completed.\nTotal distance traveled: "+totalDistance+" km");
		}

		System.out.println("\nThankyou for using our Bus Route Distance Tracker");
	}

	// Main method to call the non-static method
	public static void main(String args[]){
		// Create object to call non-static method
		BusRouteDistanceTracker tracker = new BusRouteDistanceTracker();
		tracker.startJourney();
	}
}
