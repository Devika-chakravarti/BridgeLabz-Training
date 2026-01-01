package com.inheritance.hybridinheritance.restaurantmanagementsystem;

public class UseRestaurantManagementSystem {
	public static void main(String[] args) {

        Worker chef = new Chef("Ramesh", 101);
        Worker waiter = new Waiter("Suresh", 102);

        chef.performDuties();
        waiter.performDuties();
    }
}
