/* Scenario-based: 8
 * 
 * "CampusConnect – College Information System"
Story: Your university launches CampusConnect, a portal to manage students, teachers, and
courses. You're developing the academic module.
Requirements:
● Person (base class): common fields like name, email, id.
● Student and Faculty extend Person (use inheritance).
● ICourseActions interface with methods like enrollCourse() and dropCourse().
● Course class has a list of students and a faculty assigned.
● Use constructors to initialize students and courses.
● Use access modifiers: student grades must be private.
● Use operators to calculate GPA based on grades.
● Polymorphism: printDetails() works differently for Student and Faculty.
 * */


package com.collegeinformationsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class UseCollegeInformationSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("====== WELCOME TO CAMPUS CONNECT ======\n");

        // ---------- FACULTY INPUT ----------
        System.out.print("Enter number of faculties: ");
        int fCount = input.nextInt();
        input.nextLine();

        ArrayList<Faculty> faculties = new ArrayList<>();

        for (int i = 0; i < fCount; i++) {
            System.out.println("\nEnter details for Faculty " + (i + 1));
            System.out.print("ID: ");
            int id = input.nextInt();
            input.nextLine();

            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Email: ");
            String email = input.nextLine();

            faculties.add(new Faculty(id, name, email));
        }

        // ---------- STUDENT INPUT ----------
        System.out.print("\nEnter number of students: ");
        int sCount = input.nextInt();
        input.nextLine();

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < sCount; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            System.out.print("ID: ");
            int id = input.nextInt();
            input.nextLine();

            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Email: ");
            String email = input.nextLine();

            System.out.print("Total Marks: ");
            int marks = input.nextInt();

            System.out.print("Number of Subjects: ");
            int subjects = input.nextInt();
            input.nextLine();

            Student s = new Student(id, name, email);
            s.calculateGpa(marks, subjects);
            students.add(s);
        }

        // ---------- COURSE INPUT ----------
        System.out.print("\nEnter number of courses: ");
        int cCount = input.nextInt();
        input.nextLine();

        ArrayList<Course> courses = new ArrayList<>();

        for (int i = 0; i < cCount; i++) {
            System.out.println("\nEnter details for Course " + (i + 1));
            System.out.print("Course Name: ");
            String cname = input.nextLine();

            System.out.println("Select Faculty:");
            for (int j = 0; j < faculties.size(); j++) {
                System.out.println((j + 1) + ". " + faculties.get(j).name);
            }
            int fIndex = input.nextInt() - 1;
            input.nextLine();

            courses.add(new Course(cname, faculties.get(fIndex)));
        }

        // ---------- ENROLLMENT ----------
        System.out.println("\n----- Student Enrollment -----");

        for (int i = 0; i < students.size(); i++) {
            System.out.println("\nEnroll courses for " + students.get(i).name);

            System.out.print("How many courses to enroll? ");
            int count = input.nextInt();
            input.nextLine();

            for (int j = 0; j < count; j++) {
                System.out.println("Select Course:");
                for (int k = 0; k < courses.size(); k++) {
                    System.out.println((k + 1) + ". " + courses.get(k).getCourseName());
                }
                int cIndex = input.nextInt() - 1;
                input.nextLine();

                courses.get(cIndex).addStudent(students.get(i));
            }
        }

        // ---------- DISPLAY ----------
        System.out.println("\n------------- Faculty Details -------------\n");
        for (int i = 0; i < faculties.size(); i++) {
            faculties.get(i).printDetails();
            System.out.println();
        }

        System.out.println("\n------------- Student Details -------------\n");
        for (int i = 0; i < students.size(); i++) {
            students.get(i).printDetails();
            System.out.println();
        }

        System.out.println("\n------------- Course Details -------------");
        for (int i = 0; i < courses.size(); i++) {
            courses.get(i).showCourseDetails();
        }

        input.close();
    }
}
