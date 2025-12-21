import java.util.*;
public class UnitConvertorExtenderVersionThree{
	
	// static method to convert fahrenheit into celsius
	public static double convertfarhenheit2celsius(double farhenheit){
		double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
		return farhenheit2celsius;
	}

	// static method to convert celsius into fahrenheit
	public static double convertcelsius2farhenheit(double celsius){
		double celsius2farhenheit = (celsius * 9 / 5) + 32;
		return celsius2farhenheit;
	}

	// static method to convert pounds into kilograms
	public static double convertpounds2kilograms(double pounds){
		double pounds2kilograms = 0.453592
		return pounds2kilograms;
	}

	// static method to convert kilograms into pounds
	public static double convertkilograms2pounds(double kilograms){
		double kilograms2pounds = 2.20462;
		return kilograms2pounds;
	}

	// static method to convert gallons into liters
	public static double convertgallons2liters(double gallons){
		double gallons2liters = 3.78541;
		return gallons2liters;
	}

	// static method to convert liters into gallons
	public static double convertliters2gallons(double liters){
		double liters2gallons = 0.264172;
		return liters2gallons;
	}

}