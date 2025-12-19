import java.util.*;
public class FactorialForLoop {
    	public static void main(String args[]) {

        	Scanner input = new Scanner(System.in);
        	int number = input.nextInt();


        	// Check for natural number
        	if(number > 0){
            		int factorial = 1;

            		// Compute factorial using for loop
            		for(int i = 1; i <= number; i++){
                		factorial *= i;
            		}

            		// Print result
            		System.out.println("Factorial of " + number + " is " + factorial);
        	}	


        	input.close();
    	}
}
