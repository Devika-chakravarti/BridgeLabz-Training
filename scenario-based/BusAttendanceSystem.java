/*
Scenario-based problem: 9

School Bus Attendance System 
Track 10 students' presence.
- Use for-each loop on names.
- Ask "Present or Absent?"
- Print total present and absent counts.
*/

/*
A for-each loop in Java is used to go through each element of an array or collection one by one, without using index numbers.
*/


import java.util.*;
public class BusAttendanceSystem{

    // Non-static method to handle attendance logic
    public void checkAttendance(String[] students){
        Scanner input = new Scanner(System.in);

	// Initially, both present and absent count is 0
        int presentCount = 0;
        int absentCount = 0;

	System.out.println("----------------------------------------");
	System.out.println("            Attendance check            ");
	System.out.println("----------------------------------------\n");

        // Using for-each loop to go through student names
        for(String name : students){
            System.out.print("Is " + name + " Present or Absent? ");
            String status = input.nextLine();

            if(status.equalsIgnoreCase("present")){
                presentCount++;
            } 
	    else if(status.equalsIgnoreCase("absent")){
                absentCount++;
            } 
	    else{
                System.out.println("Invalid input!!!(Please enter Present or Absent)");
            }
        }

        // Display result
	System.out.println("\nTOTAL STUDENTS: " + students.length);
        System.out.println("Present: " + presentCount);
        System.out.println("Absent: " + absentCount);
    }


    // Main method to take input and call non-static method
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

	// Stores the names of 10 students
        String[] students = new String[10];

	System.out.println("========== SCHOOL BUS ATTENDANCE ==========\n");
        System.out.println("Enter names of 10 students:\n");

	// Taking 10 student names
        for(int i = 0; i < students.length; i++){
            System.out.print("Student " + (i + 1) + ": ");
            students[i] = input.nextLine();
        }
	System.out.println();

        // Creating object to call non-static method
        BusAttendanceSystem obj = new BusAttendanceSystem();
        obj.checkAttendance(students);

	input.close();
    }
}
