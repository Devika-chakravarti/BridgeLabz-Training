import java.util.*;
public class SumOfNaturalNumbersForLoop {
	public static void main(String args[]) {

        	Scanner input = new Scanner(System.in);
        	int n = input.nextInt();


        	// Check for Natural Number using for loop
        	if(n > 0){

            		// Calculate sum using for loop
            		int sum = 0;
            		for(int i = 1; i <= n; i++){
                	sum += i;
            	}


            	// Calculate sum using formula
            	int sumFormula = n * (n + 1) / 2;


	            	// if else block to Compare results of sum calculated by using for loop and formula
        	    	if(sum == sumFormula){
                		System.out.println("Both results are equal");
            		} else {
                		System.out.println("Results are not equal");
            		}

        	} 


		else {
            		System.out.println("Number enetered by the user is not a natural number");
        	}


		input.close();
    	}
}
