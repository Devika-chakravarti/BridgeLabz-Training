import java.util.*;
public class CalendarDisplay{

    // Method to get the name of the month
    public String getMonthName(int month){
	// a month Array to store the names of the months
        String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
        return months[month-1];
    }

    // Method to check leap year
    public boolean isLeapYear(int year){
        if(year%400==0||(year%4==0&&year%100!=0)){
            return true;
        }
        return false;
    }

    // Method to get the number of days in the month
    public int getDaysInMonth(int month,int year){
        // a days Array to store the number of days in each month
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
	    // For Feb month, check for Leap Year to get the number of days
        if(month==2&&isLeapYear(year)){
            return 29;
        }
        return days[month-1];
    }

    // method to get the first day of the month using the Gregorian calendar algorithm
    public int getFirstDay(int month,int year){
        int d=1;
        int y0=year-(14-month)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=month+12*((14-month)/12)-2;
        int d0=(d+x+(31*m0)/12)%7;
        return d0;
    }

    // Method to display calendar
    public void displayCalendar(int month,int year){
        String monthName=getMonthName(month);
        int days=getDaysInMonth(month,year);
        int firstDay=getFirstDay(month,year);

        System.out.println(monthName+" "+year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Indentation before first day
        for(int i=0;i<firstDay;i++){
            System.out.print("    ");
        }

        // Display days of month
        for(int day=1;day<=days;day++){
            System.out.printf("%3d ",day);
            if((day+firstDay)%7==0){
                System.out.println();
            }
        }
        System.out.println();
    }

    // Main method takes month and year as user input and displays the result
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        CalendarDisplay obj=new CalendarDisplay();

        // Taking input from user
        System.out.print("Enter month: ");
        int month=input.nextInt();

        System.out.print("Enter year: ");
        int year=input.nextInt();

        obj.displayCalendar(month,year);

	    input.close();
    }
}
