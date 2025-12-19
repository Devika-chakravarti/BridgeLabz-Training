import java.util.*;
public class FactorsOfNumberWhileLoop{
	public static void main(String args[]){

        	Scanner input = new Scanner(System.in);
        	int number = input.nextInt();


        	// Check if number is positive
        	if(number > 0){
            		System.out.println("Factors are: ");
				
			// Counter variable 
            		int counter = 1; 
			// Count till the counter is less than the number
            		while(counter < number){
				// Check for perfect divisibility by the counter to find the factors
                		if(number % counter == 0){
					// Print the factors (value of the counter)
                    			System.out.println(counter);
                		}
                		counter++;
            		}
        	}

        
		input.close();
	}
}
