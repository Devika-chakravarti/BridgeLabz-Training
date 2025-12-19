import java.util.*;
public class MeanHeightOfFootballTeam{
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		// Declaring heights array with size 11
		double[] heights = new double[11];
		// Using for loop, take 11 input heights from user
		for(int i = 0 ; i < 11 ; i++){
			heights[i] = input.nextDouble();
		}


		// Stores the sum of heights of football players
		int sumHeights = 0;
		


		// Using for loop, inside add all heights and stores in the sum variable 
		for(int i = 0 ; i < 11 ; i++){
			sumHeights += heights[i];
		}

		// Calculate mean height of the football team
		double meanHeight = sumHeights / 11;



		// Print Mean height of the football team
		System.out.println("Mean height of the football team: " + meanHeight);



		input.close();
	}
}