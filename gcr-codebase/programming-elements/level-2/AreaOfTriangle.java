import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		double base = input.nextDouble();
		double height = input.nextDouble();


		// Calculating area of triangle by using formula (0.5 * base * height)
		// By default area of triangle is in cm as the user input will be taken as in cm
		double areaOfTriangleInCm = 0.5 * base * height;
				
		// Area of triangle in inches
		double areaOfTriangleInInches = areaOfTriangleInCm / 2.54;


		// Displaying the area of triangle in cm and inches
		System.out.print("The Area of the triangle in sq in is " + areaOfTriangleInCm + " and sq cm is " + areaOfTriangleInInches);
	}
}