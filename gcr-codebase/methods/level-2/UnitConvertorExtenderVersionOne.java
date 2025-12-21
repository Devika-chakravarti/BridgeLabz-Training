import java.util.*;
public class UnitConvertorExtenderVersionOne{
	
	// static method to convert km into miles
	public static double convertKmToMiles(double km){
		double km2miles = km * 0.621371;
		return  km2miles;
	}

	// static method to convert miles into km
	public static double convertMilesTokm(double miles){
		double miles2km = miles * 1.60934;
		return  miles2km;
	}

	// static method to convert meters into feet
	public static double convertMetersToFeet(double m){
		double meters2feet = m * 3.28084;
		return  meters2feet;
	}

	// static method to convert feet into meters
	public static double convertFeetToMeters(double feet){
		double feet2meters = feet *0.3048;
		return feet2meters;
	}


}