/*
Scenario-based problem: 15

Rohan’s Library Reminder App 
Rohan wants a fine calculator:
- Input return date and due date.
- If returned late, calculate fine: ₹5/day.
- Repeat for 5 books using for-loop.
*/


import java.util.*;
import java.time.*;

public class RohansLibraryReminderApp{

	// This method calculates the fine for one book
	// It receives the due date, return date, and book number
	public void calculateFine(LocalDate dueDate,LocalDate returnDate,int bookNumber){
		System.out.println("\nBook "+bookNumber);

		// Extracting year, month, and day from due date
		int dueYear=dueDate.getYear();
		int dueMonth=dueDate.getMonthValue();
		int dueDay=dueDate.getDayOfMonth();

		// Extracting year, month, and day from return date
		int returnYear=returnDate.getYear();
		int returnMonth=returnDate.getMonthValue();
		int returnDay=returnDate.getDayOfMonth();

		// This variable will store how many days the book is late
		int lateDays=0;

		// Checking if return year is greater than due year
		if(returnYear>dueYear){
			// Converting year difference into days (approximation)
			lateDays=(returnYear-dueYear)*365;

			// Adding month difference
			lateDays+=(returnMonth-dueMonth)*30;

			// Adding day difference
			lateDays+=(returnDay-dueDay);
		}
		// If both dates are in the same year
		else if(returnYear==dueYear){

			// If return month is later than due month
			if(returnMonth>dueMonth){
				lateDays=(returnMonth-dueMonth)*30;
				lateDays+=(returnDay-dueDay);
			}

			// If both month and year are same, compare days
			else if(returnMonth==dueMonth && returnDay>dueDay){
				lateDays=returnDay-dueDay;
			}
		}

		// If late days are greater than zero, calculate fine
		if(lateDays>0){
			int fine=lateDays*5;
			System.out.println("Late by "+lateDays+" days");
			System.out.println("Fine: "+fine+" Rs");
		}else{
			// If returned on time or earlier
			System.out.println("No fine");
		}

		System.out.println("------------------------------------------");
	}

	// Main method starts from here
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);

		// App heading
		System.out.println(" ");
		System.out.println("      ROHAN'S LIBRARY REMINDER APP      ");
		System.out.println("      ----------------------------      ");

		RohansLibraryReminderApp app=new RohansLibraryReminderApp();

		// Loop runs for 5 books
		for(int i=1;i<=5;i++){

			// Taking due date from user
			System.out.print("\nEnter due date (yyyy-mm-dd): ");
			LocalDate dueDate=LocalDate.parse(input.next());

			// Taking return date from user
			System.out.print("Enter return date (yyyy-mm-dd): ");
			LocalDate returnDate=LocalDate.parse(input.next());

			// Calling method to calculate fine
			app.calculateFine(dueDate,returnDate,i);
		}
	}
}
