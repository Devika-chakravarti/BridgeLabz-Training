import java.util.*;
public class TrigonometricFunctionCalculation{

		
	// Method to calculate trigonometric function using methods of Math class 
	public double[] calculateTrigonometricFunctions(double angle){
		// formula to convert angle to radians
		double radians = Math.toRadians(angle);
		// Calculating sin, cos, and tan values for the given angle  
		double sin = Math.sin(radians);
		double cos = Math.cos(radians);
		double tan = Math.tan(radians);
		// Returns sin, cos, and tan values
		return new double[]{sin, cos, tan};
		
	}


	// Main method to take input angle and display sine, cosine, and tangent values
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		// Take input angle(in degrees) from the user
 		System.out.print("Enter angle(in degrees): ");
		double angle = input.nextDouble();

		// Create calculator object
		TrigonometricFunctionCalculation calculator = new TrigonometricFunctionCalculation();
		// Using calculator object to call the calculateTrigonometricFunctions method and passes the angle
		double[] result = calculator.calculateTrigonometricFunctions(angle);

		// Print the sine, cosine and tangent values
		System.out.println("Sine: " + result[0]);
		System.out.println("Cosine: " + result[1]);
		System.out.println("Tangent: " + result[2]);

		input.close();
	}
}