import java.util.Scanner;
public class DoubleOperation{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();


		// Performing 3 double operations on user input values 
		double operation1 = a + b * c;
		double operation2 = a * b + c;
		double operation3 = c + a / b;
		double operation4 = a % b + c;


		// Printing all calculated operations in separate lines
		System.out.print("Result of Operation1: " + operation1 + "\n" + "Result of Operation2: " + operation2 + "\n" +  "Result of Operation3: " + operation3 + "\n" + "Result of Operation4: " + operation4);
	
	}
}