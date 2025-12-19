import java.util.*;
public class PowerOfNumberForLoop{
	public static void main(String args[]){

        	Scanner input = new Scanner(System.in);
        	// Take user input number and power
        	int number = input.nextInt();
        	int power = input.nextInt();

        	// Initialize result and counter
        	int result = 1;
       	 	
		// Check for positive integers
        	if(number > 0 && power > 0){

            		// Using For loop from 1 to power
            		for(int i = 1 ; i <= power ; i++){
                		result = result * number;
            		}

            		// Print the result
            		System.out.println(result);
        	}
		

		input.close();
	}
}
