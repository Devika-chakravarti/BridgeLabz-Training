import java.util.Scanner;
public class AreaOfCircle{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		Float radius = s.nextFloat();
		Double area = 3.14*radius*radius;
		System.out.print("Area of cicle: " + area);
	}
}