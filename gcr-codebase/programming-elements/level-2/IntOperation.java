import java.util.Scanner;
public class IntOperation{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();


		// Performing 3 integer operations on user input values 
		int operation1 = a + b * c;
		int operation2 = a * b + c;
		int operation3 = c + a / b;
		int operation4 = a % b + c;


		// Printing all calculated operations in separate lines
		System.out.print("Result of Operation1: " + operation1 + "\n" + "Result of Operation2: " + operation2 + "\n" +  "Result of Operation3: " + operation3 + "\n" + "Result of Operation4: " + operation4);
	
	}
}