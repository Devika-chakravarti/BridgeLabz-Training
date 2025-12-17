import java.util.Scanner;
public class PerimeterOfRectangle{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the length: ");
		float length = s.nextFloat();
		System.out.print("Enter the width: ");
		float width = s.nextFloat();
		
		double perimeter = 2*(length + width);
		System.out.print("Perimeter of rectangle: " + perimeter);
		
	}
}