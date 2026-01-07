package com.personalizedlearningplatform;

public class Instructor extends User {

    private String specialization;

    public Instructor(String name, String email, int userId, String specialization) {
        super(name, email, userId);
        this.specialization = specialization;
    }

    public void showInstructorRole() {
        System.out.println("----------------------------------------");
        System.out.println("INSTRUCTOR INFORMATION");
        System.out.println("----------------------------------------");
        System.out.println("Specialization: " + specialization);
        System.out.println("----------------------------------------");
    }
}
