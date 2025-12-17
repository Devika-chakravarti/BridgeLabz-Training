import java.util.Scanner;
public class KmToMilesInput{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		double distance = input.nextDouble();

		
		// Calculating distance(in miles) from distance(in km) by using formula 1 mile = 1.6 km
		double kmToMilesConversion = distance / 1.6;


		// Displaying calculated distance in miles
		System.out.print("The total miles is " + kmToMilesConversion + " mile for the given " + distance + " km");
	}
}