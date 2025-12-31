/*
Scenario-based problem: 11

Temperature Logger 
Record temperatures over 7 days.
- Use array and for-loop.
- Find average and max temperature.
- Use if for comparisons. Maintain readable naming and modular code blocks.
*/


import java.util.*;
public class TemperatureLogger{


	// Non-static method to find the average temperature
	public double computeAverageTemperature(double[] temperature){
		double totalTemperature = 0;
		// Using for loop to get the total temperature for 7 days
		for(int i=0;i<temperature.length;i++){
			totalTemperature += temperature[i];
		}
		// Formula to compute the average temperature
		double averageTemperature = totalTemperature / temperature.length;
		return averageTemperature;
	}

	
	// Non-static method to find the maximum temperature
	public double computeMaximumTemperature(double[] temperature){
		// Assume maximum temperature is the temperature of day1
		double maxTemperature = temperature[0];
		// Using for loop to find the maximum temperature by keep comparing with other temperatures
		for(int i=0;i<temperature.length;i++){
			if(maxTemperature < temperature[i]){
				maxTemperature = temperature[i];
			}
		}
		return maxTemperature;
	}


	// Main method to take input temperatures from the user and create object to call the non-static method
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);

		System.out.println("-------------------------------------------------");
		System.out.println("        TEMPERATURE LOGGER (in degrees)           ");
		System.out.println("-------------------------------------------------");

		// Take input temperatures from the user for 7 days
		int days = 7;
		double[] temperature = new double[days];
		for(int i=0;i<days;i++){
			System.out.print("Enter the temperature(for day " + (i+1) + ")" + ": ");
			temperature[i] = input.nextDouble();
		}
		System.out.println();		

		// Create object to call the non-static method
		TemperatureLogger obj = new TemperatureLogger();
		
		// Storing results by calling the non-static methods
		double averageTemperature = obj.computeAverageTemperature(temperature);
		double maxTemperature = obj.computeMaximumTemperature(temperature);

		System.out.println("-------------------------------------------------");
		System.out.println("         COMPUTED AVG AND MAX TEMPERATURE        ");
		System.out.println("-------------------------------------------------");

		// Display the result
		System.out.printf("Average temperature: %.2f", averageTemperature);
		System.out.print("\nMaximum temperature: " + maxTemperature);

		input.close();

	}

}