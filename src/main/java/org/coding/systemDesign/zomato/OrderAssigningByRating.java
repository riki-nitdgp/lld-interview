package org.coding.systemDesign.zomato;

import java.util.*;

public class OrderAssigningByRating implements OrderAssigningSystem{

    List<Restaurant> restaurants;

    OrderAssigningByRating(List<Restaurant> restaurants){
        this.restaurants = restaurants;
    }

    @Override
    public void assignOrder(CartItem cartItem, User user) {
        Comparator<Restaurant> ratingComparator = (p1, p2) -> p2.getRating() - p1.getRating();
        Collections.sort(this.restaurants, ratingComparator);
        boolean isOrderAssigned = false;
        int iteration = 0;
        while(!isOrderAssigned && this.restaurants.size() > iteration){
            for(Restaurant restaurant: this.restaurants) {
                if (restaurant.orderLimit >0){
                    List<String> allMenuItem = new ArrayList<>();
                    for(Menu menu: restaurant.menu){
                        allMenuItem.add(menu.item.getName());
                    }
                    List<String> cart =  new ArrayList<>();
                    for(Cart cart_: cartItem.items){
                        cart.add(cart_.item.getName());
                    }
                    if (new HashSet<>(allMenuItem).containsAll(cart)){
                        int cartValue = getCartPrice(cartItem, restaurant.menu);
                        String orderId = UUID.randomUUID().toString();
                        cartItem.cartPrice = cartValue;
                        Order order = new Order(orderId, OrderStatus.ACCEPTED, cartItem, user);
                        restaurant.addOrder(order);
                        isOrderAssigned = true;
                        System.out.println("Order Assigned Successfully Retaurant Name: "+ restaurant.name + " cart Price "+ cartItem.cartPrice);
                        break;
                    }
                }
                iteration++;
            }
        }
        if(!isOrderAssigned){
            System.out.println("Cannot assign the order");
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
