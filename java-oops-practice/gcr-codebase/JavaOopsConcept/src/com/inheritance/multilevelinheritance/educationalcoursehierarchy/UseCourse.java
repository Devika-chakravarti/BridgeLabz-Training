package com.inheritance.multilevelinheritance.educationalcoursehierarchy;

public class UseCourse {
	public static void main(String[] args) {

        PaidOnlineCourse course = new PaidOnlineCourse(
                "Java Full Stack",
                120,
                "Udemy",
                true,
                5999,
                20
        );

        course.displayInfo();
    }

}
