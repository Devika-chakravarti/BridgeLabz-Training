package com.universitycourseenrollmentsystem;
public class Enrollment{
    private Student student;
    private Course course;

    public Enrollment(Student student,Course course){
        this.student=student;
        this.course=course;
    }

    public void showDetails(){
        System.out.println(student.getTranscript());
        System.out.println("Course: "+course.getCourseName());
    }
}
