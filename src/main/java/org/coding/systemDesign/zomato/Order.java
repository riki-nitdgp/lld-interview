package org.coding.systemDesign.zomato;

public class Order {

    String orderId;
    OrderStatus orderStatus;
    CartItem orderItems;
    User user;

    public Order(String orderId, OrderStatus orderStatus, CartItem orderItems, User user) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
        this.orderItems = orderItems;
        this.user = user;
    }
}
