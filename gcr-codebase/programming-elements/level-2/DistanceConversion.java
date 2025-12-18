import java.util.Scanner;
public class DistanceConversion{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		double distanceInFeet = input.nextDouble();


		// Calculating given distance in yards and miles
		double distanceInYard = distanceInFeet / 3;
       		double distanceInMiles = distanceInYard / 1760;
	   

	  	// Displaying the distance in yards and miles
		System.out.print("Distance in yards is " + distanceInYard + "\n" + "Distance in miles is " + distanceInMiles);
	}
}