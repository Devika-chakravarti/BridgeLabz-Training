import java.util.*;
public class RocketLaunchUsingWhileLoop{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		// Create a variable counter to take user inputed value for the countdown
		int counter = input.nextInt();


		// Use the while loop to check if the counter is 1
		while(counter >= 1){
			
			// Print the value of the counter
			System.out.println(counter);
			counter--;
		}


		input.close();
	}
}