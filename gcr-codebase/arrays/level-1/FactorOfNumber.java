import java.util.*;
public class FactorOfNumber{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int maxFactor = 10;

		// Declare factors array with size maxFactor
		int[] factors = new int[maxFactor];
		// index to track number of factors stored
		int index = 0;


		// Using for loop to iterate and find the factors and storing it in factors array
		for(int i = 1 ; i <= number ; i++){
			
			// Checking for factors(complete divisibility with no remainder)
			if(number % i == 0){
				
				// if array is full then resize it
				if(index == maxFactor){
					
					// Double the size of the maxFactor
                    			maxFactor = maxFactor*2;
					// Using temp array to store the elements from the factors array and assigning the factors array to it
                    			int[] temp = new int[maxFactor];
                    			for(int j = 0; j < index; j++){
                        			temp[j] = factors[j];
                    			}
					// Assigning temp value to factors
                    			factors = temp;
                		}
				
				// Updating factors with the ith value
                		factors[index] = i;
				// Incrementing index value by 1 each time
                		index++;
			}			
		}


		
		// Print the factors of the number		
		System.out.println("Factors of " + number + " are: ");
	        for (int i = 0; i < index; i++) {
       			System.out.println(factors[i]);
        	}



		input.close();

	}
}