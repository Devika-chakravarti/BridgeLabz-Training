import java.util.Scanner;
public class DiscountCalculationInput{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int fee = input.nextInt();
		double discountPercent = input.nextDouble();



		// Calculating discount amount
		double discountAmount = (discountPercent / 100) * fee;

		// Calculating final discounted fee
		double finalDiscountedFee = fee - discountAmount;


		
		// Displaying the calculated discount amount and the final discounted fee
		System.out.print("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalDiscountedFee);
	
	}
}