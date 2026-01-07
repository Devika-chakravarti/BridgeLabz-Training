package com.eventmanagementplatform;

public class User {

    private String name;
    private String email;
    private String phone;

    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void displayUser() {
        System.out.println("----------------------------------------");
        System.out.println("Organizer Name : " + name);
        System.out.println("Email          : " + email);
        System.out.println("Phone          : " + phone);
        System.out.println("----------------------------------------");
    }
}
