package com.personalfitnesstracker;

public abstract class Workout implements ITrackable {

    protected String type;
    protected double duration;
    protected double caloriesBurned;

    public Workout(String type, double duration) {
        this.type = type;
        this.duration = duration;
    }

    public abstract void calculateCalories();

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    @Override
    public void startWorkout() {
        System.out.println("Workout started: " + type);
    }

    @Override
    public void stopWorkout() {
        System.out.println("Workout completed: " + type);
    }
}
