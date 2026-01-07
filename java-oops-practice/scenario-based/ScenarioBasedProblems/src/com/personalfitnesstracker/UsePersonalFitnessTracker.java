package com.personalfitnesstracker;

import java.util.Scanner;

public class UsePersonalFitnessTracker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("          WELCOME TO FITTRACK");
        System.out.println("========================================");
        System.out.println();

        System.out.print("Enter name               : ");
        String name = input.nextLine();

        System.out.print("Enter age                : ");
        int age = input.nextInt();

        System.out.print("Enter weight (kg)        : ");
        double weight = input.nextDouble();
        input.nextLine();

        System.out.println();
        System.out.println("Available Fitness Goals");
        System.out.println("----------------------------------------");
        System.out.println("1. Weight Loss");
        System.out.println("2. Muscle Gain");
        System.out.println("3. Maintain Fitness");
        System.out.println("4. Increase Stamina");
        System.out.println("----------------------------------------");

        System.out.print("Choose goal (1-4)         : ");
        int goalChoice = input.nextInt();
        input.nextLine();

        String goal;
        switch (goalChoice) {
            case 1:
                goal = "Weight Loss";
                break;
            case 2:
                goal = "Muscle Gain";
                break;
            case 3:
                goal = "Maintain Fitness";
                break;
            case 4:
                goal = "Increase Stamina";
                break;
            default:
                goal = "Maintain Fitness";
        }

        UserProfile user = new UserProfile(name, age, weight, goal);
        System.out.println();
        user.displayProfile();

        System.out.println();
        System.out.println("Available Workout Types");
        System.out.println("----------------------------------------");
        System.out.println("1. Cardio Workout");
        System.out.println("2. Strength Workout");
        System.out.println("----------------------------------------");

        System.out.print("Choose workout type (1-2): ");
        int workoutChoice = input.nextInt();

        System.out.print("Enter workout duration (minutes): ");
        double duration = input.nextDouble();

        Workout workout;

        if (workoutChoice == 1) {
            workout = new CardioWorkout("Cardio", duration);
        } else {
            workout = new StrengthWorkout("Strength", duration);
        }

        System.out.println();
        workout.startWorkout();
        workout.calculateCalories();
        workout.stopWorkout();

        double burned = workout.getCaloriesBurned();
        double remaining = user.calculateProgress(burned);

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("WORKOUT SUMMARY");
        System.out.println("----------------------------------------");
        System.out.println("Workout Type     : " + workout.type);
        System.out.println("Duration         : " + duration + " minutes");
        System.out.println("Calories Burned  : " + burned);
        System.out.println("Remaining Target : " + remaining);
        System.out.println("----------------------------------------");

        System.out.println();
        System.out.println("========================================");
        System.out.println("      THANK YOU FOR USING FITTRACK");
        System.out.println("========================================");

        input.close();
    }
}
