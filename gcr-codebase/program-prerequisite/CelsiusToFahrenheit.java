import java.util.Scanner;
public class CelsiusToFahrenheit{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the temperature(in celsius): ");
		float temperature = s.nextFloat();
		System.out.println("Temperature(in fahrenheit): " + ((temperature * 9/5)+32));
	}
}