package com.collegeinformationsystem;

public class Faculty extends Person {

    public Faculty(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void printDetails() {
        System.out.println("Faculty ID : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Email      : " + email);
    }
}
