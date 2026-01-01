package com.inheritance.hybridinheritance.restaurantmanagementsystem;

class Waiter extends Person implements Worker {

    public Waiter(String name, int id) {
        super(name, id);
    }

    // implementing interface method
    public void performDuties() {
        System.out.println("Waiter is serving food to customers.");
    }
}
