import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZones{


    // Non-static method to display current time in a specific time zone
    public void displayTime(String zoneName){
        // Get current time for the specified zone
        ZonedDateTime zdt=ZonedDateTime.now(ZoneId.of(zoneName));
        
        // Format the date-time in a readable way
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        
        // Print the formatted time
        System.out.println(zoneName+": "+zdt.format(formatter));
    }


    // Main method to call the non static method to display the current time in different zones
    public static void main(String[] args){
        // Create object to call non-static method
        TimeZones obj=new TimeZones();

        // Display current time in different zones(Greenwich Mean Time,Indian Standard Time,Pacific Standard Time)
        obj.displayTime("GMT");                  
        obj.displayTime("Asia/Kolkata");         
        obj.displayTime("America/Los_Angeles");  
    }
}
