import java.util.*;
public class SimpleInterestCalculation{


	// Method to calculate simple interest
	public double simpleInterest(double principal, double rate, double time){
		// calculating simple interest using the formula (SI = P*R*T/100)
		double simpleInterest = (principal * rate * time) / 100;
		// return the calculated simple interest
		return simpleInterest;
	}


	// Main method to take input, to create object by using which the simpleInterest method will be called and returns the calculated simple interest
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		// Taking input from the user i.e. principal amount, rate and time
		System.out.print("Enter the prinicpal amount: ");
		double principal = input.nextDouble();
		System.out.print("Enter the rate: ");
		double rate = input.nextDouble();
		System.out.print("Enter the time: ");
		double time = input.nextDouble();
		
		// Create an object named si 
		SimpleInterestCalculation si = new SimpleInterestCalculation(); 

		// Create a variable that will store the calculation of Simple interest by calling simpleInterest method
		double result = si.simpleInterest(principal, rate, time);
		
		// Print the calculated SI with the user input principal, rate and time 
		System.out.println("The Simple Interest is " + result + " for Principal " + principal + "," + " Rate of Interest " + rate + " and Time " + time);	

		input.close();
	}
}