public class DiscountCalculation{
	public static void main(String args[]){
		
		int fee = 125000;
		double discountPercent = 10;



		// Calculating discount amount
		double discountAmount = (discountPercent / 100) * fee;

		// Calculating final discounted fee
		double finalDiscountedFee = fee - discountAmount;


		
		// Displaying the calculated discount amount and the final discounted fee
		System.out.print("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalDiscountedFee);
	
	}
}