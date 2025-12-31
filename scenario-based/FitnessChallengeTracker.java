/*
Scenario-based problem: 13

Sandeep’s Fitness Challenge Tracker 
Each day Sandeep completes a number of push-ups.
- Store counts for a week.
- Use for-each to calculate total and average.
- Use continue to skip rest days.
*/


import java.util.*;
public class FitnessChallengeTracker{

    // Method to calculate total pushups using for-each loop 
    public int computeTotalPushups(int[] numberOfPushups){
        int totalPushups = 0;
        for(int count : numberOfPushups){
	    // Skip rest days
            if(count == 0){
                continue; 
            }
            totalPushups += count;
        }
        return totalPushups;
    }

    // Method to calculate average pushups
    public double computeAveragePushups(int totalPushups){
        int days = 7;
	// returning the avrage pushups
        return (double) totalPushups / days;
    }

    // Main method to take input number of pushups from the Sandeep and create object to call the non-static methods and print the result
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("           FITNESS CHALLENGE TRACKER             ");
        System.out.println("-------------------------------------------------");

	// store the number of pushups of Sandeep for 7 days
        int days = 7;
        int[] numberOfPushups = new int[days];
        for(int i = 0; i < days; i++){
            System.out.print("Enter pushups for Day " + (i + 1) + ": ");
            numberOfPushups[i] = input.nextInt();
        }

	// Create obect to call non-static method
        FitnessChallengeTracker obj = new FitnessChallengeTracker();

	// Stores the result after calling the non-sttaic methods
        int totalPushups = obj.computeTotalPushups(numberOfPushups);
        double averagePushups = obj.computeAveragePushups(totalPushups);

        System.out.println("-------------------------------------------------");
        System.out.println("        COMPUTED TOTAL AND AVERAGE PUSHUPS        ");
        System.out.println("-------------------------------------------------");

	// Display the result
        System.out.println("Total Pushups: " + totalPushups);
        System.out.printf("Average Pushups: %.2f\n", averagePushups);
    }
}
