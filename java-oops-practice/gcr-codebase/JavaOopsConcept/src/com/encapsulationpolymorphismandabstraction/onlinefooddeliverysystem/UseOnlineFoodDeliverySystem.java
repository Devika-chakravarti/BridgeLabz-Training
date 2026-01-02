package com.encapsulationpolymorphismandabstraction.onlinefooddeliverysystem;

import java.util.ArrayList;

public class UseOnlineFoodDeliverySystem {

    public static void main(String[] args) {

        ArrayList<FoodItem> orderList = new ArrayList<>();

        orderList.add(new VegItem("Paneer Butter Masala", 250, 2));
        orderList.add(new NonVegItem("Chicken Biryani", 300, 1));

        processOrder(orderList);
    }

    public static void processOrder(ArrayList<FoodItem> items) {

        for (int i = 0; i < items.size(); i++) {

            FoodItem item = items.get(i);

            item.getItemDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println(item.getDiscountDetails());

            System.out.println("---------------------------------------------");
        }
    }
}
