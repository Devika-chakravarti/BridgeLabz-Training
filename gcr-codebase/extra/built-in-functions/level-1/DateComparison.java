import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison{

    // Non-static method to compare two dates(check if the first date is before, after, or the same as the second date)
    public void compareDates(LocalDate date1,LocalDate date2){
        if(date1.isBefore(date2)){
            System.out.println(date1+" is before "+date2);
        }else if(date1.isAfter(date2)){
            System.out.println(date1+" is after "+date2);
        }else if(date1.isEqual(date2)){
            System.out.println(date1+" is the same as "+date2);
        }
    }


    // Main method to take two input dates from the user and display if the first date is before, after, or the same as the second date
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        // Take input for first date
        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate date1=LocalDate.parse(input.nextLine());
        // Take input for second date
        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate date2=LocalDate.parse(input.nextLine());

        // Create object to call non-static method
        DateComparison obj=new DateComparison();

        // Compare the two dates
        obj.compareDates(date1,date2);

        input.close();
    }
}
