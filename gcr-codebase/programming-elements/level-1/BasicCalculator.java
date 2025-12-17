import java.util.Scanner;
public class BasicCalculator{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		float number1 = input.nextFloat();
		float number2 = input.nextFloat();

		

		// Performing addition of the two numbers
		double addition = number1 + number2;		

		// Performing subtraction (number1 minus number2)
		double subtraction = number1 - number2;

		// Performing multiplication of the two numbers
		double multiplication = number1 * number2;

		// Performing division of number1 by number2
		double division = number1/number2;



		// Displaying the results after performing addition, subtraction, multiplication and division operation on two numbers taken from the user
		System.out.print("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + " and " + division); 
	
	}
}