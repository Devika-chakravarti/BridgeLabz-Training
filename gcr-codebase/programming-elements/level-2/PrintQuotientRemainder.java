import java.util.Scanner;
public class PrintQuotientRemainder{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();


		// Calculating quotient of number1 and number2
		double quotient = number1 / number2;
		
		// Calculating remainder of number1 and number2
		double remainder = number1 % number2;


		// Printing calculated quotient and remainder
		System.out.print("The Quotient is " + quotient + " and Remainder is " + remainder + " of two number " + number1 + " and " + number2);	
	}
}