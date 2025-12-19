import java.util.*;
public class MultiplesBelow100WhileLoop {
	public static void main(String args[]){

        	Scanner input = new Scanner(System.in);
		// Take user input integer and store in the variable number
        	int number = input.nextInt();


        	// Check for positive integer less than 100
        	if(number > 0 && number < 100){
                       	
			int counter = number - 1;
           	 	// Using while loop until counter is greater than 1
            		while(counter > 1){
				if(number % counter == 0){
                			System.out.println(counter);
				}
				counter--;
            		}

        	} 



        	input.close();
    	}
}
