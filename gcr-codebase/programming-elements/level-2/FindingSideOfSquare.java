import java.util.Scanner;
public class FindingSideOfSquare{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		double perimeter = input.nextDouble();


		// Calculating the side of square from the perimeter taken from the user
		Double sideOfSquare = perimeter/4;
		

		// Displaying the side of square with it's perimeter
		System.out.print("The length of the side is " + sideOfSquare + " whose perimeter is " + perimeter);
	}
}