package com.constructor.levelone;

public class Circle {

    // Attribute
    private double radius;

    // Default constructor
    Circle() {
        this(4.5);
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println("Radius of circle(default): " + c1.getRadius());

        Circle c2 = new Circle(7.2);
        System.out.println("Radius of circle(user-defined): " + c2.getRadius());
    }
}
