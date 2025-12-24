import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting{

    // Non-static method to display current date in different formats
    public void showFormattedDates(){
        // Get current date
        LocalDate today=LocalDate.now();

        // Define different date formats with custom patterns
        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3=DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Display date in different formats
        System.out.println("Format dd/MM/yyyy: "+today.format(format1));
        System.out.println("Format yyyy-MM-dd: "+today.format(format2));
        System.out.println("Format EEE, MMM dd, yyyy: "+today.format(format3));
    }

    
    // Main method to call the non static method through object
    public static void main(String[] args){
        // Create object to call non-static method
        DateFormatting obj=new DateFormatting();

        // Call method to display formatted dates
        obj.showFormattedDates();
    }
}
