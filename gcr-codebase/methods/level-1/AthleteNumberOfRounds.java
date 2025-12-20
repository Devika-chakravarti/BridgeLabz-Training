import java.util.*;
public class AthleteNumberOfRounds{


	// Method to calculate the perimeter and the number of rounds needed by the athlete to complete 5km (which converted into meters -> 5000m)
	public double numberOfRounds(double side1, double side2, double side3){
		// Calculate perimeter of triangle
		double perimeter = side1 + side2 + side3;
		// Calculate rounds needed by using formula distance/perimeter
		double rounds = 5000 / perimeter;
		// Returns the calculated rounds
		return rounds;
	}


	// Main method is used to take three sides of the triangle and create object to call the numberOfRounds method
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		// Take three sides of the triangle from the user
		System.out.print("Enter the first side: ");
		double side1 = input.nextDouble();
		System.out.print("Enter the second side: ");
		double side2 = input.nextDouble();
		System.out.print("Enter the third side: ");
		double side3 = input.nextDouble();
	
		// Create object calculator
		AthleteNumberOfRounds calculator = new AthleteNumberOfRounds();
		// Calling the numberOfRounds method using this object	
		double noOfRounds = calculator.numberOfRounds(side1, side2, side3);	

		// Print the calculated number of rounds
		System.out.println("Number of rounds needed by the athlete to complete 5 km run: " + noOfRounds);

		input.close();
	}
}