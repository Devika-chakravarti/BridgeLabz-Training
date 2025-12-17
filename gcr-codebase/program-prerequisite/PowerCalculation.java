import java.util.*;
public class PowerCalculation{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the base value: ");
		double base = s.nextDouble();
		System.out.print("Enter the exponent value: ");
		double exponent = s.nextDouble();
		
		double powercalc = Math.pow(base, exponent);
		System.out.print("Result after calculating power: " + powercalc);
		
	}
}