import java.util.*;
public class CollinearPointsChecker{


    // Method to check collinearity using slope formula
    public static boolean checkCollinearUsingSlope(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3){

        // Avoid division by zero
        if((x2 - x1) == 0 || (x3 - x2) == 0 || (x3 - x1) == 0){
            return false;
        }

        // Calculate slopes
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Points are collinear if all slopes are equal
        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }


    // Method to check collinearity using area of triangle formula
    public static boolean checkCollinearUsingArea(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3){

        // Area of triangle formula
        double area = 0.5 * (
                x1 * (y2 - y3)
              + x2 * (y3 - y1)
              + x3 * (y1 - y2)
        );

        // Points are collinear if area is zero
        return area == 0;
    }


    // Main method
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Take input for 3 points
        System.out.print("Enter x1 y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter x2 y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("Enter x3 y3: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Check using slope method
        boolean slopeResult = checkCollinearUsingSlope(
                x1, y1, x2, y2, x3, y3);
        // Check using area method
        boolean areaResult = checkCollinearUsingArea(
                x1, y1, x2, y2, x3, y3);

        // Display results
        System.out.println("\nUsing Slope Formula:");
        if (slopeResult) {
            System.out.println("Points are collinear");
        } else {
            System.out.println("Points are NOT collinear");
        }

        System.out.println("\nUsing Area of Triangle Formula:");
        if (areaResult) {
            System.out.println("Points are collinear");
        } else {
            System.out.println("Points are NOT collinear");
        }

        input.close();
    }
}
