import java.util.*;
public class RocketLaunchUsingForLoop{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		// Create a variable counter to take user inputed value for the countdown
		int counter = input.nextInt();


		// Use the for loop to check if the counter is 1
		for(;counter>=1;counter--){
			
			// Print the value of the counter
			System.out.println(counter);
		}


		input.close();
	}
}