package com.generics.personalizedmealplangenerator;

public class MealGenerator {
	static <T extends MealPlan> Meal<T> generateMeal(String userName, T plan) {
		return new Meal<>(userName, plan);
	}
}
