import java.util.*;
public class KilometersToMilesConversion{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the distance(in km): ");
		double distance = s.nextDouble();
		
		double resultantdistance = distance*0.621371;
		System.out.print("Resultant distance(in miles): " + resultantdistance);
		
	}
}