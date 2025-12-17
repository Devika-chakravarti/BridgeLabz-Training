import java.util.Scanner;
public class VolumeOfCylinder{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		float radius = s.nextFloat();
		System.out.print("Enter the height: ");
		float height = s.nextFloat();
		Double volume = 3.14 * radius * radius * height;
		System.out.printf("Volume of cylinder: %.2f", volume);
	}
}