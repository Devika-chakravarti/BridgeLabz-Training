import java.util.*;
public class UnitConvertorExtenderVersionTwo{
	
	// static method to convert yards into feet
	public static double convertyards2feet(double yards){
		double yards2feet = yards * 3;
		return  yards2feet;
	}

	// static method to convert feet into yards
	public static double convertfeet2yards(double feet){
		double feet2yards = feet * 0.333333;
		return  feet2yards;
	}

	// static method to convert meters into inches
	public static double convertmeters2inches(double meters){
		double meters2inches = meters * 39.3701;
		return  meters2inches;
	}

	// static method to convert inches into meters
	public static double convertinches2meters(double inches){
		double inches2meters = inches * 0.0254;
		return inches2meters;
	}
	
	// static method to convert inches into cm
	public static double convertinches2cm(double inches){
		double inches2cm = inches * 2.54;
		return inches2cm;
	}

}