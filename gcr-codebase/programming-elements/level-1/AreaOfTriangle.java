import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		double base = input.nextDouble();
		double height = input.nextDouble();


		// Calculating area of triangle by using formula (0.5 * base * height)
		double areaoftriangle = 0.5 * base * height;
		

		// Displaying the area of triangle
		System.out.print("Area of triangle is " + areaoftriangle + " whose base is " + base + " and height is " + height);
	}
}