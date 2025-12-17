import java.util.*;
public class AverageOfThreeNumbers{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the number1: ");
		double num1 = s.nextDouble();
		System.out.print("Enter the number2: ");
		double num2 = s.nextDouble();
		System.out.print("Enter the number3: ");
		double num3 = s.nextDouble();

		double avg = (num1+num2+num3)/3;
		System.out.print("Average of " + num1 + ", " + num2 + ", " + num3 + " = " + avg);
		
	}
}