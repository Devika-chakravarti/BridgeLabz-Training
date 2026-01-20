package com.addressbooksystem;

public class Contact {
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private Address address;

	public Contact(String firstName, String lastName, String phone, String email, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void updateContact(String phone, String email, Address address) {
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " | Phone: " + phone + " | Email: " + email + " | Address: " + address;
	}
}
