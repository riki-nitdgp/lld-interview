package org.coding.systemDesign.zomato;

import java.util.ArrayList;
import java.util.List;

public class CartItem {
    List<Cart> items;
    int cartPrice;

    @Override
    public String toString() {
        return "CartItem{" +
                "items=" + items +
                ", cartPrice=" + cartPrice +
                '}';
    }

    public List<Cart> getItems() {
        return items;
    }

    public void setItems(List<Cart> items) {
        this.items = items;
    }

    public int getCartPrice() {
        return cartPrice;
    }

    public void setCartPrice(int cartPrice) {
        this.cartPrice = cartPrice;
    }

    public CartItem() {
        this.items = new ArrayList<>();
        this.cartPrice = 0;
    }

    public void addToCart(Cart item) {
        this.items.add(item);
    }
}
