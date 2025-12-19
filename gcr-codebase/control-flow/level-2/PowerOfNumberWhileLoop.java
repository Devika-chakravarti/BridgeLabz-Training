import java.util.*;
public class PowerOfNumberWhileLoop{
	public static void main(String args[]) {

        	Scanner input = new Scanner(System.in);

        	// Input number and power
        	int number = input.nextInt();
        	int power = input.nextInt();

        	// Initialize result with 1 and counter with 0
        	int result = 1;
       	 	int counter = 0;

        	// Computing power using while loop
        	while(counter < power){
            		result *= number;
            		counter++;
        	}


        	// Print the result
        	System.out.println(result);
		
		
		input.close();
    }
}
