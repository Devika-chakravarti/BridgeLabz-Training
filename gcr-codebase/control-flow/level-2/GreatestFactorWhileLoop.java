import java.util.*;
public class GreatestFactorWhileLoop{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		

		// Initialize greatestFactor with value 1
		int greatestFactor = 1;

		// Initialize counter variable
		int counter = number - 1;
		// Using while loop for finding the greatest factor from the user input integer upto 1 
		while(counter >= 1){
			if(number % counter == 0){
				greatestFctor = counter;
				break;
			}
			counter--;
		}


		// Print the calculated Greatest factor 
		System.out.println("Greatest factor: " + greatestFactor);
	
		
		input.close();
	}
}