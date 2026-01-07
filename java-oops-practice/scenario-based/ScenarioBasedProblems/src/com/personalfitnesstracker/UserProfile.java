package com.personalfitnesstracker;

public class UserProfile {

    private String name;
    private int age;
    private double weight;
    private String goal;
    private double dailyCalorieTarget;

    public UserProfile(String name, int age, double weight) {
        this(name, age, weight, "Maintain Fitness");
    }

    public UserProfile(String name, int age, double weight, String goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
        this.dailyCalorieTarget = weight * 30;
    }

    public double calculateProgress(double caloriesBurned) {
        return dailyCalorieTarget - caloriesBurned;
    }

    public void displayProfile() {
        System.out.println("----------------------------------------");
        System.out.println("USER PROFILE");
        System.out.println("----------------------------------------");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Goal   : " + goal);
        System.out.println("Daily Calorie Target: " + dailyCalorieTarget);
        System.out.println("----------------------------------------");
    }
}
