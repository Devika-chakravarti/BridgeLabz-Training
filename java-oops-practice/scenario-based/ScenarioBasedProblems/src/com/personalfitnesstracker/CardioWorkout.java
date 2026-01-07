package com.personalfitnesstracker;

public class CardioWorkout extends Workout {

    public CardioWorkout(String type, double duration) {
        super(type, duration);
    }

    @Override
    public void calculateCalories() {
        caloriesBurned = duration * 8;
    }
}
