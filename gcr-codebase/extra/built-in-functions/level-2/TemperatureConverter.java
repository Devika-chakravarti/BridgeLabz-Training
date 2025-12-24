import java.util.*;

public class TemperatureConverter{

    // Non-static method to convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double c){
        // Conversion formula
	    return (c*9/5)+32; 
    }

    // Non-static method to convert Fahrenheit to Celsius
    public double fahrenheitToCelsius(double f){
        // Conversion formula
	    return (f-32)*5/9;
    }

    public void runProgram(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp=input.nextDouble();
        System.out.print("Convert to (C/F): ");
        char unit=input.next().charAt(0);

        if(unit=='C'||unit=='c'){
            double result=fahrenheitToCelsius(temp); 
            System.out.println(temp+" Fahrenheit is "+result+" Celsius.");
        }else if(unit=='F'||unit=='f'){
            double result=celsiusToFahrenheit(temp); 
            System.out.println(temp+" Celsius is "+result+" Fahrenheit.");
        }else{
            System.out.println("Invalid unit entered.");
        }
    }

    public static void main(String[] args){
        TemperatureConverter obj=new TemperatureConverter();
        obj.runProgram();     
    }
}
