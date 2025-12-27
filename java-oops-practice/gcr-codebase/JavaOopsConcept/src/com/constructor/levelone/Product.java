package com.constructor.levelone;

public class Product{

    // Instance variables
    private String productName;
    private double price;

    // Class variable
    private static int totalProducts = 0;

    // Constructor
    Product(String productName, double price){
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method to display product details
    void displayProductDetails(){
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price + " Rs\n");
    }

    // Class method to display total products
    static void displayTotalProducts(){
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args){

        Product p1 = new Product("Laptop",85000);
        p1.displayProductDetails();

        Product p2 = new Product("Mouse",800);
        p2.displayProductDetails();

        Product.displayTotalProducts();
    }
}
