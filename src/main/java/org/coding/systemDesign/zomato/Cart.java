package org.coding.systemDesign.zomato;

public class Cart {
    Item item;
    int quantity;

    public Cart(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }
}
