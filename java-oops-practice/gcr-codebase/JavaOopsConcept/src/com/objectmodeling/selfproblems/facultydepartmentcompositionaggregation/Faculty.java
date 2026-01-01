package com.objectmodeling.selfproblems.facultydepartmentcompositionaggregation;

public class Faculty {

    String name;
    String subject;

    public Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void showFaculty() {
        System.out.println("Faculty Name: " + name + ", Subject: " + subject);
    }
}
