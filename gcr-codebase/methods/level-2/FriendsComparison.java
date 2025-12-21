import java.util.*;
public class FriendsComparison{
	
	// Method to find the youngest friend
	public int findYoungestFriend(int[] ages){
		int youngestIndex = 0;
		for(int i=1;i<ages.length;i++){
			if(ages[i] < ages[youngestIndex]){
				youngestIndex = i;
			}
		}
		return youngestIndex;
	}

	
	// Method to find the youngest friend
	public int findTallestFriend(double[] heights){
		int tallestIndex = 0;
		for(int i=1;i<heights.length;i++){
			if(heights[i] > heights[tallestIndex]){
				tallestIndex = i;
			}
		}
		return tallestIndex;
	}


	// Main method to take ages and heights of 3 friends and display the youngest and tallest friend's name
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
	
		// Friends name
		String[] names = {"Amar", "Akbar", "Anthony"};

		// Arrays to store ages and heights
		int[] ages = new int[3];
		double[] heights = new double[3];	

		// Take age and heights of 3 friends from user 
		for(int i=0;i<3;i++){
			System.out.print("Enter age of: " + names[i] + ": ");
			ages[i] = input.nextInt();

			System.out.print("Enter height of: " + names[i] + ": ");
			heights[i] = input.nextDouble();
		}	
	
		// Create object to call the non static methods
		FriendsComparison obj = new FriendsComparison();

		// store youngest and tallest friend result 
		int youngestFriend = obj.findYoungestFriend(ages);
		int tallestFriend = obj.findTallestFriend(heights);

		// Display the results
		System.out.println("\nYoungest friend: " + names[youngestFriend]);
		System.out.println("Tallest friend: " + names[tallestFriend]);

		input.close();
	}
	
}