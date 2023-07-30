package org.coding.systemDesign.zomato;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class OrderAssigningByPrice implements OrderAssigningSystem{

    List<Restaurant> restaurants;

    OrderAssigningByPrice(List<Restaurant> restaurants){
        this.restaurants = restaurants;
    }
    @Override
    public void assignOrder(CartItem cartItem, User user) {
        Restaurant assignedRestaurant = null;
        int minPrice = Integer.MAX_VALUE;
        for(Restaurant restaurant: restaurants){
            List<String> allMenuItem =  new ArrayList<>();
            if(restaurant.orderLimit>0){
                for(Menu menu: restaurant.menu){
                    allMenuItem.add(menu.item.getName());
                }
                List<String> cart =  new ArrayList<>();
                for(Cart cart_: cartItem.items){
                    cart.add(cart_.item.getName());
                }
                if (new HashSet<>(allMenuItem).containsAll(cart)){
                    int cartValue = getCartPrice(cartItem, restaurant.menu);
//                    System.out.println(cartValue);
//                    System.out.println(minPrice);
                    if (cartValue < minPrice) {
                        minPrice = cartValue;
                        assignedRestaurant = restaurant;
                    }
                    cartItem.cartPrice = minPrice;
                }
            }
        }
        if(assignedRestaurant!=null){
            System.out.println("Order Assigned Successfully Retaurant Name: "+ assignedRestaurant.name + " cart Price "+ cartItem.cartPrice);
        } else {
            System.out.println("Order Not Assign");
        }
    }


    public int getCartPrice(CartItem cartItem, List<Menu> restaurantMenu) {
        int price = 0;
        HashMap<String, Integer> priceMapping = new HashMap<>();
        for(Menu menu: restaurantMenu) {
            priceMapping.put(menu.item.name, menu.price);
        }
        for(Cart item: cartItem.items){
            Item item1 = item.item;
            int quantity = item.quantity;
            int itemPrice = priceMapping.get(item1.getName());
            price = price + (itemPrice * quantity);
        }
        return price;
    }
}
