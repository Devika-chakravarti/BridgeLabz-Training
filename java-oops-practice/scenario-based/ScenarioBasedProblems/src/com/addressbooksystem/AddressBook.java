package com.addressbooksystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AddressBook {
	private ArrayList<Contact> contacts = new ArrayList<>();

	// Add contact with duplicate validation
	public void addContact(Contact contact) {
		for (int i = 0; i < contacts.size(); i++) {
			Contact c = contacts.get(i);
			if (c.getFirstName().equalsIgnoreCase(contact.getFirstName())
					&& c.getLastName().equalsIgnoreCase(contact.getLastName())) {
				System.out.println("Duplicate contact not allowed.");
				return;
			}
		}
		contacts.add(contact);
		System.out.println("Contact added successfully.");
	}

	// Edit contact by name
	public void editContact(String firstName, String lastName, String phone, String email, Address address) {
		for (int i = 0; i < contacts.size(); i++) {
			Contact c = contacts.get(i);
			if (c.getFirstName().equalsIgnoreCase(firstName) && c.getLastName().equalsIgnoreCase(lastName)) {
				c.updateContact(phone, email, address);
				System.out.println("Contact updated successfully.");
				return;
			}
		}
		System.out.println("Contact not found.");
	}

	// Delete contact by name
	public void deleteContact(String firstName, String lastName) {
		for (int i = 0; i < contacts.size(); i++) {
			Contact c = contacts.get(i);
			if (c.getFirstName().equalsIgnoreCase(firstName) && c.getLastName().equalsIgnoreCase(lastName)) {
				contacts.remove(i);
				System.out.println("Contact deleted successfully.");
				return;
			}
		}
		System.out.println("Contact not found.");
	}

	// Search by city or state
	public void searchByCityOrState(String value) {
		boolean found = false;
		for (int i = 0; i < contacts.size(); i++) {
			Contact c = contacts.get(i);
			if (c.getAddress().getCity().equalsIgnoreCase(value) || c.getAddress().getState().equalsIgnoreCase(value)) {
				System.out.println(c);
				found = true;
			}
		}
		if (!found) {
			System.out.println("No contacts found.");
		}
	}

	// Display all contacts sorted alphabetically
	public void displayContacts() {
		Collections.sort(contacts, new Comparator<Contact>() {
			public int compare(Contact c1, Contact c2) {
				int first = c1.getFirstName().compareToIgnoreCase(c2.getFirstName());
				if (first == 0) {
					return c1.getLastName().compareToIgnoreCase(c2.getLastName());
				}
				return first;
			}
		});

		for (int i = 0; i < contacts.size(); i++) {
			System.out.println(contacts.get(i));
		}
	}
}
