/* Personalized Meal Plan Generator
 * Concepts: Generic Methods, Type Parameters, Bounded Type Parameters
Problem Statement:
Design a Personalized Meal Plan Generator where users can choose different meal categories like Vegetarian, Vegan, Keto, or High-Protein. The system should ensure only valid meal plans are generated.
Hints:
Define an interface MealPlan with subtypes (VegetarianMeal, VeganMeal, etc.).
Implement a generic class Meal<T extends MealPlan> to handle different meal plans.
Use a generic method to validate and generate a personalized meal plan dynamically.
*/

package com.generics.personalizedmealplangenerator;

import java.util.Scanner;

public class MealPlanApp {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter user name: ");
		String name = input.nextLine();
		System.out.println("\n1. Vegetarian\n2. Vegan\n3. Keto\n4. High Protein");
		System.out.print("Choose meal type: ");
		int choice = input.nextInt();

		Meal<? extends MealPlan> meal = null;

		if (choice == 1) {
			meal = MealGenerator.generateMeal(name, new VegetarianMeal());
		} else if (choice == 2) {
			meal = MealGenerator.generateMeal(name, new VeganMeal());
		} else if (choice == 3) {
			meal = MealGenerator.generateMeal(name, new KetoMeal());
		} else if (choice == 4) {
			meal = MealGenerator.generateMeal(name, new HighProteinMeal());
		} else {
			System.out.println("Invalid meal choice");
		}

		if (meal != null) {
			System.out.println("\n-------------------------------------------");
			System.out.println("           Generated Meal Plan ");
			System.out.println("-------------------------------------------");
			meal.displayMeal();
		}
	}
}
