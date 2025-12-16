import java.util.Scanner;
public class AddTwoNumbers{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number1: ");
		int num1 = s.nextInt();
		System.out.print("Enter the number2: ");
		int num2 = s.nextInt();
		System.out.println("Sum of " + num1 + " & " + num2 + " = " + (num1 + num2));
	}
}