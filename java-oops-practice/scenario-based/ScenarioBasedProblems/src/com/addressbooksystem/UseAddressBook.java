/* Address Book System
 OOP Concepts:
Classes, Objects, Encapsulation, Constructors, Access Modifiers, Collections
 Scenario:
You’ve been hired by DigiContact Pvt. Ltd., a startup creating digital tools for managing
contacts and relationships. They want a simple but robust Address Book application.
Each Contact should include:
● First Name, Last Name
● Phone Number, Email
● Address (optional: City, State, Zip)
 Problem Statement:
Develop a Java application that:
● Adds a new contact (with validation for duplicates)
● Edits an existing contact by name
● Deletes a contact by name
● Searches contacts by city or state
● Displays all contacts sorted alphabetically
● Stores contacts in an in-memory structure like ArrayList<Contact>
Use:
● Classes and constructors to initialize contacts
● Encapsulation for secure data access
● Optional use of composition (Address as a separate class)
*/

package com.addressbooksystem;

import java.util.Scanner;

public class UseAddressBook {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		AddressBook book = new AddressBook();

		System.out.println("==================================================");
		System.out.println("     WELCOME TO OUR ADDRESS BOOK SYSTEM");
		System.out.println("==================================================");

		while (true) {
			System.out.println("\n1. Add Contact");
			System.out.println("2. Edit Contact");
			System.out.println("3. Delete Contact");
			System.out.println("4. Search by City/State");
			System.out.println("5. Display All Contacts");
			System.out.println("6. Exit");
			System.out.print("Enter choice: ");

			int choice = input.nextInt();
			input.nextLine();

			if (choice == 1) {
				System.out.print("First Name: ");
				String fn = input.nextLine();
				System.out.print("Last Name: ");
				String ln = input.nextLine();
				System.out.print("Phone: ");
				String phone = input.nextLine();
				System.out.print("Email: ");
				String email = input.nextLine();
				System.out.print("City: ");
				String city = input.nextLine();
				System.out.print("State: ");
				String state = input.nextLine();
				System.out.print("Zip: ");
				String zip = input.nextLine();

				Address address = new Address(city, state, zip);
				Contact contact = new Contact(fn, ln, phone, email, address);
				book.addContact(contact);
			}

			else if (choice == 2) {
				System.out.print("First Name: ");
				String fn = input.nextLine();
				System.out.print("Last Name: ");
				String ln = input.nextLine();
				System.out.print("New Phone: ");
				String phone = input.nextLine();
				System.out.print("New Email: ");
				String email = input.nextLine();
				System.out.print("City: ");
				String city = input.nextLine();
				System.out.print("State: ");
				String state = input.nextLine();
				System.out.print("Zip: ");
				String zip = input.nextLine();

				book.editContact(fn, ln, phone, email, new Address(city, state, zip));
			}

			else if (choice == 3) {
				System.out.print("First Name: ");
				String fn = input.nextLine();
				System.out.print("Last Name: ");
				String ln = input.nextLine();
				book.deleteContact(fn, ln);
			}

			else if (choice == 4) {
				System.out.print("Enter City or State: ");
				String value = input.nextLine();
				book.searchByCityOrState(value);
			}

			else if (choice == 5) {
				book.displayContacts();
			}

			else if (choice == 6) {
				System.out.println("\n==================================================");
				System.out.println("   THANK YOU FOR USING OUR ADDRESS BOOK SYSTEM");
				System.out.println("==================================================");
				break;
			}

			else {
				System.out.println("Invalid choice.");
			}
		}
		input.close();
	}
}
