import java.util.*;
public class PrimeCheck{
    	public static void main(String args[]){

        	Scanner input = new Scanner(System.in);
        	int number = input.nextInt();


        	// Prime numbers are greater than 1
        	if(number > 1){
			// Assume number is prime
            		boolean isPrime = true; 

            		// Loop from 2 to number-1
            		for(int i = 2; i < number; i++){
                		if(number % i == 0){
					// divisible by a number other than 1 and itself
                    			isPrime = false;
					// No need to check further                     
					break; 
                		}
            		}

            		// Print the result whether the number is Prime number or not a prime number
            		if(isPrime){
            			System.out.println(number + " is a Prime Number");
            		}else{
                		System.out.println(number + " is not a Prime Number");
            		}

        	}else{
            		System.out.println("Number should be greater than 1 to be a prime number");
        	}


        	input.close();
    	}
}
