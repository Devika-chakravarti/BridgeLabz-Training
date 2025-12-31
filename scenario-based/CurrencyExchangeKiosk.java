/*
Scenario-based problem: 18

Currency Exchange Kiosk 
Design a currency converter:
- Take INR amount and target currency.
- Use a switch to apply the correct rate.
- Ask if the user wants another conversion (do-while).
*/

/*
Curreny I'm targeting are: USD -> United States Dollar,Euro -> European currency,GBP -> Great British Pound,JPY -> Japenese Yen
*/

import java.util.*;
public class CurrencyExchangeKiosk{

	// Non-static method to perform currency conversion
	public void convertCurrency(double inrAmount,int currencyOption){
		// Variable to store converted amount
		double convertedAmount = 0;

		// Switch to apply conversion rate based on selected currency
		switch(currencyOption){
			// Convert INR to USD
			case 1:
				convertedAmount = inrAmount * 0.011;
				System.out.println("Amount in USD: " + convertedAmount);
				break;

			// Convert INR to Euro
			case 2:
				convertedAmount = inrAmount * 0.0095;
				System.out.println("Amount in Euro: " + convertedAmount);
				break;

			// Convert INR to GBP
			case 3:
				convertedAmount = inrAmount * 0.0083;
				System.out.println("Amount in GBP: " + convertedAmount);
				break;

			// Convert INR to JPY
			case 4:
				convertedAmount = inrAmount * 1.74;
				System.out.println("Amount in JPY: " + convertedAmount);
				break;

			// Handle invalid currency option
			default:
				System.out.println("Invalid currency option selected!");
		}
	}

	// Main method
	public static void main(String args[]){
		// Scanner object to take input from user
		Scanner input = new Scanner(System.in);

		// Create object to call non-static method
		CurrencyExchangeKiosk kiosk = new CurrencyExchangeKiosk();

		// Variable to store user's choice for repeating conversion
		char choice;

		// Print welcome message
		System.out.println(" ");
		System.out.println("   WELCOME TO OUR CURRENCY EXCHANGE KIOSK   ");
		System.out.println("---------------------------------------------");

		// do-while loop to allow multiple conversions
		do{
			// Ask user to enter amount in INR
			System.out.print("\nEnter amount in INR: ");
			double inrAmount = input.nextDouble();

			// Display available currency options
			System.out.println("Select target currency:");
			System.out.println("1. USD");
			System.out.println("2. Euro");
			System.out.println("3. GBP");
			System.out.println("4. JPY");

			// Ask user to select currency option
			System.out.print("Enter option (1-4): ");
			int currencyOption = input.nextInt();

			// Call non-static method to convert the amount
			kiosk.convertCurrency(inrAmount,currencyOption);

			// Ask user if they want to perform another conversion
			System.out.print("Do you want another conversion? (y/n): ");
			choice = input.next().charAt(0);

		}while(choice=='y' || choice=='Y');

		// Print thank you message at the end
		System.out.println("\nThankyou for using our Currency Exchange Kiosk!");
	}
}
