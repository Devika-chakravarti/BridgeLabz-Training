/* Scenario-based: 10
 * 
 * "EduMentor – Personalized Learning Platform"
Story: EduMentor is an AI-based learning platform. You're tasked with implementing the module
to manage courses, quizzes, and learner progress.

Requirements:
● User base class: name, email, userId.
● Learner and Instructor inherit from User.
● ICertifiable interface with method generateCertificate().
● Quiz class: fields for questions, answers, and score.
● Use constructors to create quizzes with variable difficulty.
● Encapsulation for quiz answers (can’t be modified once set).
● Use operators to score the quiz and generate a percentage.
● Polymorphism: generateCertificate() works differently for short courses vs
full-time.
● Apply access modifiers: internal question banks must remain private.
 * */

package com.personalizedlearningplatform;

import java.util.Scanner;

public class UsePersonalizedLearningPlatform {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("        WELCOME TO EDUMENTOR");
        System.out.println("========================================");
        System.out.println();

        System.out.print("Enter learner name       : ");
        String name = input.nextLine();

        System.out.print("Enter email              : ");
        String email = input.nextLine();

        System.out.print("Enter user id            : ");
        int userId = input.nextInt();
        input.nextLine();

        System.out.println();
        System.out.println("Available Course Types");
        System.out.println("----------------------------------------");
        System.out.println("1. Short Course");
        System.out.println("2. Full-Time Course");
        System.out.println("----------------------------------------");

        String courseType;
        while (true) {
            System.out.print("Enter course type (short / full-time): ");
            courseType = input.nextLine();

            if (courseType.equalsIgnoreCase("short") ||
                courseType.equalsIgnoreCase("full-time")) {
                break;
            }
            System.out.println("Invalid course type. Please enter short or full-time.");
        }

        Learner learner = new Learner(name, email, userId, courseType);
        System.out.println();
        learner.displayUserInfo();

        String[] questions = {
                "Java is a ______?",
                "OOP stands for ______?"
        };

        String[] correctAnswers = {
                "programming language",
                "object oriented programming"
        };

        Quiz quiz = new Quiz(questions, correctAnswers, "Easy");

        String[] userAnswers = new String[questions.length];

        System.out.println();
        System.out.println("========================================");
        System.out.println("              QUIZ STARTED");
        System.out.println("========================================");

        for (int i = 0; i < questions.length; i++) {
            System.out.print(questions[i] + " ");
            userAnswers[i] = input.nextLine();
        }

        quiz.evaluateQuiz(userAnswers);
        quiz.displayResult();

        learner.generateCertificate(quiz.calculatePercentage());

        System.out.println();
        System.out.println("========================================");
        System.out.println("     THANK YOU FOR USING EDUMENTOR");
        System.out.println("========================================");

        input.close();
    }
}
