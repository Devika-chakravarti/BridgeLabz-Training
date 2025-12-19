import java.util.*;
public class YoungestAndTallestFriend{
	public static void main(String args[]){

        	Scanner input = new Scanner(System.in);
        	int[] age = new int[3];
        	double[] height = new double[3];

        	// Taking input for age and height
        	for(int i = 0 ; i < 3 ; i++){
                	age[i] = input.nextInt();
			height[i] = input.nextDouble();
        	}

        	// Initialize youngest and tallest
        	int youngestIndex = 0;
        	int tallestIndex = 0;

        	// Finding youngest and tallest
        	for(int i = 1 ; i < 3 ; i++){
			// Comparing based on user input age for 3 friends
            		if(age[i] < age[youngestIndex]){
                		youngestIndex = i;
            		}
			// Comparing based on user input height for 3 friends
           		if(height[i] > height[tallestIndex]){
                		tallestIndex = i;
            		}
        	}

        	// Printing the result
        	System.out.println("Youngest Friend: " + names[youngestIndex]);
        	System.out.println("Tallest Friend: " + names[tallestIndex]);


        	input.close();
    	}
}
