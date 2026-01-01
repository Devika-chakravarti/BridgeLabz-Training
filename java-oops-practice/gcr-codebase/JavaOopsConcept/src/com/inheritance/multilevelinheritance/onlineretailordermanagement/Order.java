package com.inheritance.multilevelinheritance.onlineretailordermanagement;
class Order {

    // private attributes for encapsulation
    private int orderId;
    private String orderDate;

    // constructor
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // getters
    public int getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    // method to return order status
    public String getOrderStatus() {
        return "Order Placed";
    }
}
