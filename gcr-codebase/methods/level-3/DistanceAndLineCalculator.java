import java.util.*;
public class DistanceAndLineCalculator{


    // Method to calculate Euclidean distance between two points and return the distance
    public static double calculateDistance(double x1,double y1,double x2,double y2){
        // Using Euclidean distance formula sqrt((x2-x1)^2 + (y2-y1)^2)
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }


    // Method to find the equation of a line (y = m*x + b) given two points and return the equation which includes slope and -intercept
    public static double[] findLineEquation(double x1,double y1,double x2,double y2){
        double m; // slope
        double b; // y-intercept

        if(x2 != x1){
            m = (y2 - y1) / (x2 - x1);   // slope formula
        } 
	else{
            m = Double.POSITIVE_INFINITY; // vertical line
        }

        b = y1 - m * x1; // y-intercept formula
        return new double[]{m,b};
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Take input for two points
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // Calculate distance
        double distance = calculateDistance(x1,y1,x2,y2);
        System.out.println("Euclidean Distance: " + distance);

        // Find line equation
        double[] equation = findLineEquation(x1,y1,x2,y2);
        double slope = equation[0];
        double intercept = equation[1];

        // Display line equation
        if(slope == Double.POSITIVE_INFINITY){
            System.out.println("The line is vertical: x = " + x1);
        } 
	else{
            System.out.println("Equation of the line: y = " + slope + "*x + " + intercept);
        }

        input.close();
    }


}
