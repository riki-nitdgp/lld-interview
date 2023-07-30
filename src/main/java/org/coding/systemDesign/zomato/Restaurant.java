package org.coding.systemDesign.zomato;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Restaurant {

    String name;
    String address;
    List<Menu> menu;

    HashMap<String, Order> orders;
    int rating;
    int orderLimit;

    Restaurant(String name, int rating, int orderLimit){
        this.name = name;
        this.rating = rating;
        this.orderLimit = orderLimit;
        this.orders = new HashMap<>();
        this.menu = new ArrayList<>();
    }

    public void addMenuItem(Menu item){
        this.menu.add(item);
    }

    public void updateMenu(Menu item) {
        for(Menu menu: this.menu){
            if(item.item.getName() == menu.item.getName()){
                menu.price = item.price;
            }
        }
    }

    public void addOrder(Order order) {
        this.orders.put(order.orderId, order);
        updateOrderStatus(order.orderId, OrderStatus.ACCEPTED);
    }

    public void updateOrderStatus(String orderId, OrderStatus status){
        Order order = this.orders.get(orderId);
        order.orderStatus = status;
        this.orders.put(orderId, order);
        if (status == OrderStatus.ACCEPTED) {
            this.orderLimit -=1;
        } else if (status == OrderStatus.COMPLETED) {
            this.orderLimit +=1;
        }
    }


    public int getRating() {
        return rating;
    }

}
