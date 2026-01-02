package com.encapsulationpolymorphismandabstraction.librarymanagementsystem;

import java.util.ArrayList;

public class UseLibraryManagementSystem {

    public static void main(String[] args) {

        ArrayList<LibraryItem> items = new ArrayList<>();

        items.add(new Book("B101", "Java Basics", "James"));
        items.add(new Magazine("M201", "Tech Monthly", "Editorial Team"));
        items.add(new DVD("D301", "Inception", "Nolan"));

        for (int i = 0; i < items.size(); i++) {

            LibraryItem item = items.get(i);

            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            item.processReservation("Devika");
            System.out.println("Available: " + item.isAvailable());

            System.out.println("----------------------------------");
        }
    }
}
