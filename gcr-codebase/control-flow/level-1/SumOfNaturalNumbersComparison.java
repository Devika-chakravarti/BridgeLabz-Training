import java.util.*;
public class SumOfNaturalNumbersComparison {
	public static void main(String args[]) {
	
		Scanner input = new Scanner(System.in);
        	int number = input.nextInt();

		// Check number is a natural number (number greater than 0)
        	if(number > 0){
            
           		int sum = 0;
			// Calculate sum using while loop
            		int i = 1;
            		while(i <= n){
                		sum += i;
                		i++;
            		}

            	
		// Calculate sum using formula
            			int sumFormula = n * (n + 1) / 2;
					
		    	
			// if else Block to compare the sum of natural numbers calculated using while loop and the formula 
            					if(sum == sumFormula){
                					System.out.println("Both results are correct and equal");
            					}
			else{
                					System.out.println("Results are not equal");
            					}

        			}

		// Display message when user input number is not a natural number
		else{
            				System.out.println("Number entered by the user isn't a natural number");
        			}


        			input.close();
    		}
}
