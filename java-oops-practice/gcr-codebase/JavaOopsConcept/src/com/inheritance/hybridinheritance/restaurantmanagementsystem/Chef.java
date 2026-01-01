package com.inheritance.hybridinheritance.restaurantmanagementsystem;

class Chef extends Person implements Worker {

    public Chef(String name, int id) {
        super(name, id);
    }

    // implementing interface method
    public void performDuties() {
        System.out.println("Chef is preparing meals.");
    }
}
