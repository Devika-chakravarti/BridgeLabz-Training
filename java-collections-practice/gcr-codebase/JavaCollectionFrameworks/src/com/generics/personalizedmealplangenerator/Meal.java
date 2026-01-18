package com.generics.personalizedmealplangenerator;

public class Meal<T extends MealPlan> {
	String userName;
	T mealPlan;

	Meal(String userName, T mealPlan) {
		this.userName = userName;
		this.mealPlan = mealPlan;
	}

	void displayMeal() {
		System.out.println("User: " + userName + ", Meal Plan: " + mealPlan.getMealType());
	}
}
