import java.util.*;
public class MultiplesBelow100ForLoop{
	public static void main(String args[]) {

        	Scanner input = new Scanner(System.in);
		// Take user input integer and store in the variable number
        	int number = input.nextInt();


        	// Check for positive integer less than 100
        	if(number > 0 && number < 100){
                	// Loop backward from 100 to 1
            		for(int i = 100 ; i >= 1 ; i--){
                		if(i % number == 0){
                    			System.out.println(i);
                		}
            		}

        	}


        	
		input.close();
    	}
}
