public class ProfitLossCalculation{
	public static void main(String args[]){

		double costPrice = 129;
		double sellingPrice = 191;
		
		// Calculating Profit		
		double profit = sellingPrice - costPrice;

		//Calculating Profit Percentage
		double profitPercentage = profit/costPrice * 100;

		// Displaying profit and profit percentage 
		System.out.print("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" + "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
		
	}
}