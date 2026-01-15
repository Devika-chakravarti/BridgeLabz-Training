/* Bird Sanctuary
 * 
 *  Goal: Design and implement a Bird Sanctuary system to manage
different types of birds, utilizing Inheritance and Polymorphism.
 Scenario (Story-Based):
You are hired by the EcoWing Wildlife Conservation Center, which runs a Bird Sanctuary to
protect and study various birds. They want to digitize their tracking and behavior management
system.
The sanctuary houses a variety of birds, each with different abilities:
● Some can fly (e.g., Eagle, Sparrow)
● Some can swim (e.g., Duck, Penguin)
● Some can both fly and swim (e.g., Seagull)
● Some can neither (e.g., Kiwi, Ostrich)
Each bird has:
● A name
● A species
● A unique ID
● Behaviors like eat(), and if applicable, fly(), swim()

 Requirements / Problem Statement:
Design a Java application that fulfills the following:
1. Use Inheritance:
● Create a base class Bird with common properties and methods (name, id, species,
eat()).
● Derive classes like Eagle, Duck, Penguin, etc., extending the Bird class.
● Create interfaces: Flyable, Swimmable – with abstract methods fly() and swim()
respectively.
● Implement these interfaces in relevant bird classes.

2. Use Polymorphism:
● Maintain a list of all birds in the sanctuary.
● Use a loop to call fly() or swim() polymorphically only for birds that implement
those behaviors.

3. Functionality to Implement:
●  Add new birds to the sanctuary
●  Search birds by flying/swimming ability
●   Display all birds with their full information and abilities
● ️ Remove a bird by ID
●  Show a report that counts how many birds are Flyable, Swimmable, Both, or Neither

 Technical Constraints:
● Use Java Inheritance and Interfaces
● Use Polymorphism for invoking fly/swim/eat methods
● Use ArrayList<Bird> or Map<String, Bird> to store bird records
● Follow good OOP practices: encapsulation, clean code, modular design
   Stretch Goals (Optional):
● Save and load bird data from a file (using serialization)
● Add age, health status, or feeding schedule
● Track last feeding time or behavior logs
 Example Output (CLI):
Welcome to EcoWing Bird Sanctuary
1. Add Bird
2. Display All Birds
3. Display All Flying Birds
4. Display All Swimming Birds
5. Display Both Flying & Swimming Birds
6. Delete Bird by ID
7. Sanctuary Report
8. Exit
*/

package com.birdsanctuary;

import java.util.Scanner;

public class UseBirdSanctuary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		SanctuaryManager manager = new SanctuaryManager();

		System.out.println("======================================================");
		System.out.println("    WELCOME TO OUR ECOWING BIRD SANCTUARY");
		System.out.println("======================================================");

		while (true) {
			System.out.println("\n1. Add Bird");
			System.out.println("2. Display All Birds");
			System.out.println("3. Display All Flying Birds");
			System.out.println("4. Display All Swimming Birds");
			System.out.println("5. Delete Bird by ID");
			System.out.println("6. Sanctuary Report");
			System.out.println("7. Exit");
			System.out.print("Enter choice: ");

			int choice = input.nextInt();
			input.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter Bird ID: ");
				String id = input.nextLine();

				System.out.print("Enter Bird Name: ");
				String name = input.nextLine();

				System.out.println("Select Bird Type:");
				System.out.println("1. Eagle");
				System.out.println("2. Duck");
				System.out.println("3. Penguin");
				System.out.println("4. Seagull");
				System.out.println("5. Kiwi");

				int type = input.nextInt();
				input.nextLine();

				Bird bird = null;

				if (type == 1)
					bird = new Eagle(id, name);
				else if (type == 2)
					bird = new Duck(id, name);
				else if (type == 3)
					bird = new Penguin(id, name);
				else if (type == 4)
					bird = new Seagull(id, name);
				else if (type == 5)
					bird = new Kiwi(id, name);

				if (bird != null)
					manager.addBird(bird);
				break;

			case 2:
				manager.displayAllBirds();
				break;

			case 3:
				manager.displayFlyingBirds();
				break;

			case 4:
				manager.displaySwimmingBirds();
				break;

			case 5:
				System.out.print("Enter Bird ID to delete: ");
				manager.deleteBirdById(input.nextLine());
				break;

			case 6:
				manager.sanctuaryReport();
				break;

			case 7:
				System.out.println("\n======================================================");
				System.out.println("    THANK YOU FOR USING OUR ECOWING BIRD SANCTUARY");
				System.out.println("======================================================");
				return;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}
