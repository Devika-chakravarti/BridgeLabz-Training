package com.encapsulationpolymorphismandabstraction.ecommerceplatform;

public abstract class Product {

	// Attributes
    private String productId;
    private String name;
    private double price;

    // Constructor
    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Setters 
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method
    public abstract double calculateDiscount();

    // Default tax behavior
    public double calculateTax() {
        return 0;
    }

    public void getTaxDetails() {
        System.out.println("No tax applicable.");
    }

    // Concrete method
    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}
