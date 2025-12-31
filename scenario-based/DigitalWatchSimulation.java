/*
Scenario-based problem: 16

Digital Watch Simulation 
Simulate a 24-hour watch:
- Print hours and minutes in a nested for-loop.
- Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements
*/

/*
(A digital watch is running normally, showing time every minute. Suddenly at 13:00, the power goes off, so the watch stops.)
- LOGIC:
Outer loop is for controls hours
Inner loop is for controls minutes
Every loop print the one minute passing
break is used to stop the watch when power goes off
*/


public class DigitalWatchSimulation{
	public static void main(String args[]){

		System.out.println(" ");
		System.out.println("     DIGITAL WATCH    ");
		System.out.println("-------------------------");

		// Loop for hours in a day (0 to 23)
		for(int hour=0;hour<24;hour++){

			// Loop for minutes in each hour (0 to 59)
			for(int minute=0;minute<60;minute++){

				// Displaying current time on the digital watch
				System.out.println("Time: "+hour+" : "+minute);

				// Power cut happens exactly at 13:00
				if(hour==13 && minute==0){
					System.out.println(" ");
					System.out.println("POWER CUT!!");
					break;
				}
			}

			// Stop the outer loop when power cut happens
			if(hour==13){
				break;
			}
		}

		System.out.println("-------------------------");
		System.out.println("    SIMULATION ENDED    ");
	}
}
