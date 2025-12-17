import java.util.Scanner;
public class TotalPriceCalculation{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int unitPrice = input.nextInt();
		int quantity = input.nextInt();

		
		// Calculating the total price of the item
		int totalPrice = unitPrice * quantity;


		// Displaying the total price when user gives unit price and the quantity
		System.out.print("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
		
	}
}