package com.personalizedlearningplatform;

public abstract class User {

    protected String name;
    protected String email;
    protected int userId;

    public User(String name, String email, int userId) {
        this.name = name;
        this.email = email;
        this.userId = userId;
    }

    public void displayUserInfo() {
        System.out.println("----------------------------------------");
        System.out.println("USER DETAILS");
        System.out.println("----------------------------------------");
        System.out.println("Name   : " + name);
        System.out.println("Email  : " + email);
        System.out.println("User ID: " + userId);
        System.out.println("----------------------------------------");
    }
}
