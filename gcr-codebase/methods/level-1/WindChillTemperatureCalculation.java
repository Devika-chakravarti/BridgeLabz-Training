import java.util.*;
public class WindChillTemperatureCalculation{


	// Method to calculate wind chill temperature by using formula 
	public double calculateWindChill(double temperature, double windSpeed){
		// calculate windchill temperature using formula
		double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
		// return the value of calculated wind chill temperature
		return windChill;
	}

	
	// Main method to take temperature and speed of the wind from the user and create object to call the method by passing arguments
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
	
		// Take temperature and speed of the wind from the user
		System.out.print("Enter the temperature: ");
		double temperature = input.nextDouble();
		System.out.print("Enter the speed of wind: ");
		double windSpeed = input.nextDouble();

		// Create object calculator 
		WindChillTemperatureCalculation calculator = new WindChillTemperatureCalculation();
		// Create variable that will call the calculateWindChill by using object calculatorand passing the values taken from the user
		double resultantWindChillTemperature = calculator.calculateWindChill(temperature, windSpeed);

		// Print the windChill temperature
		System.out.println("Wind chill temperature: " + resultantWindChillTemperature);

		input.close();
	}
}