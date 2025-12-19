import java.util.*;
public class FizzBuzzWhileLoop{
	public static void main(String args[]){
	
        	Scanner input = new Scanner(System.in);
        	int number = input.nextInt();

		// Check that input number is positive integer
	        if(number > 0){

        	    	int i = 1;
            		// FizzBuzz using while loop
            		
			while(i <= number){
				
				// Check for divisibility of both 3 and 5
                		if(i % 3 == 0 && i % 5 == 0){
                    			System.out.println("FizzBuzz");
                		}
				// Check for divisibility of 3
				else if(i % 3 == 0){
                    			System.out.println("Fizz");
                		}
				// Check for divisibility of 5
				else if(i % 5 == 0){
                    			System.out.println("Buzz");
                		}	
				// Otherwise print the value
				else{
                    			System.out.println(i);
                		}

                		i++;
            		}
        	} 


        	input.close();
    	}
}


