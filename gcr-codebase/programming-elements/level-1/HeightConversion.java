import java.util.Scanner;
public class HeightConversion{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		Float height = input.nextFloat();



		// Converting height from cm to inches(Using formula: 1 inch = 2.54 cm)
        	float heightInInches = height / 2.54f;

        	// Converting height from inches to feet(Using formula: 1 foot = 12 inches)
        	int heightInFeet = (int)(heightInInches / 12); 
        	float remainingInches = heightInInches - (heightInFeet * 12); 		


		
		// Displaying Give height(in cm) with the height converted in feet and in inches
		System.out.print("Your Height in cm is " + height + " while in feet is " + heightInFeet + " and inches is " + remainingInches);
	}
}