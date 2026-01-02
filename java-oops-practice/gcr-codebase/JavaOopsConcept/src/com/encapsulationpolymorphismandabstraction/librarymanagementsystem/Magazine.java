package com.encapsulationpolymorphismandabstraction.librarymanagementsystem;

public class Magazine extends LibraryItem implements Reservable {

    private boolean available = true;

    // Constructor
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (available) {
            setBorrowerName(borrowerName);
            available = false;
            System.out.println("Magazine reserved successfully.");
        } else {
            System.out.println("Magazine is not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }

    @Override
    public void processReservation(String borrowerName) {
        reserveItem(borrowerName);
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}
