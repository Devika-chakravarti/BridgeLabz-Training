public class SamsAveragePercentMark{
	public static void main(String args[]){

		int maths = 94;
		int physics = 95;
		int chemistry = 96;
		
		// Calculating Sam's average mark in PCM
		int averagePercent = ((maths + physics + chemistry)/3)*100;
		
		// Displaying Sam's average mark in PCM
		System.out.print("Sam’s average mark in PCM is " + averagePercent);
	}
}