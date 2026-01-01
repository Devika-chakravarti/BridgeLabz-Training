package com.inheritance.multilevelinheritance.onlineretailordermanagement;
class ShippedOrder extends Order {

    private String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // getter
    public String getTrackingNumber() {
        return trackingNumber;
    }

    // overriding method
    public String getOrderStatus() {
        return "Order Shipped";
    }
}
