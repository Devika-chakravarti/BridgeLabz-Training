package com.personalfitnesstracker;

public class StrengthWorkout extends Workout {

    public StrengthWorkout(String type, double duration) {
        super(type, duration);
    }

    @Override
    public void calculateCalories() {
        caloriesBurned = duration * 6;
    }
}
