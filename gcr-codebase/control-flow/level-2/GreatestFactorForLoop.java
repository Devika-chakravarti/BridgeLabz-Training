import java.util.*;
public class GreatestFactorForLoop{
	public static void main(String args[]){

        	Scanner input = new Scanner(System.in);
        	int number = input.nextInt();


		// initialize to 1
            	int greatestFactor = 1;


            	// Using for loop from number-1 down to 1
            	for(int i = number - 1; i >= 1; i--){
                	if(number % i == 0){
				// Set the value of greatestFactor to i
                    		greatestFactor = i;
				// exit loop as soon as we find the greatest factor
                    		break; 
                	}
            	}

            	System.out.println("Greatest factor: " + greatestFactor);
       

        
		input.close();
    	}
}
