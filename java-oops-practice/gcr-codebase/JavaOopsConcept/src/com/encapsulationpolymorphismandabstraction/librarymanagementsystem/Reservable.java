package com.encapsulationpolymorphismandabstraction.librarymanagementsystem;

public interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
