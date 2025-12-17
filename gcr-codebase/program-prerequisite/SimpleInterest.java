import java.util.Scanner;
public class SimpleInterest{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the principal: ");
		double principal = s.nextDouble();
		System.out.print("Enter the rate: ");
		double rate = s.nextDouble();
		System.out.print("Enter the time: ");
		double time = s.nextDouble();
		
		double simpleinterest = (principal*rate*time)/100;
		System.out.print("Simple Interest: " + simpleinterest);
		
	}
}