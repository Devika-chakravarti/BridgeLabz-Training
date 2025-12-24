import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic{

    // Non-static method to perform date arithmetic operations
    public void performOperations(LocalDate date){
        // Add 7 days
        LocalDate result=date.plusDays(7);
        // Add 1 month
        result=result.plusMonths(1);
        // Add 2 years
        result=result.plusYears(2);
        // Subtract 3 weeks
        result=result.minusWeeks(3);

        // Format the date for display
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Display the final date after all operations
        System.out.println("Final Date: "+result.format(formatter));
    }


    // Main method to input date from the user and display the result after performing date arithmetic operation
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        // Take input date in yyyy-MM-dd format
        System.out.print("Enter a date (yyyy-MM-dd): ");
        LocalDate date=LocalDate.parse(input.nextLine());

        // Create object to call non-static method
        DateArithmetic obj=new DateArithmetic();

        // Perform date arithmetic operations
        obj.performOperations(date);

        input.close();
    }
}
