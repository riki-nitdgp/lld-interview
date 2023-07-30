package org.coding.systemDesign.zomato;

import java.util.ArrayList;
import java.util.List;

public class FoodOrderingSystem {

    List<Restaurant> restaurants;
    List<User> users;

    OrderAssigningSystem orderAssigningSystem;

    FoodOrderingSystem() {
        this.restaurants = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    void addRestaurant(Restaurant restaurant) {
        this.restaurants.add(restaurant);
    }

    void addUser(User user){
        this.users.add(user);
    }

    void placeOrder(CartItem cartItem, User user, SelectionCriteria selectionCriteria) {
        if(selectionCriteria == SelectionCriteria.HIGHEST_RATING){
            orderAssigningSystem = new OrderAssigningByRating(restaurants);
            orderAssigningSystem.assignOrder(cartItem, user);
        } else if (selectionCriteria == SelectionCriteria.LOWEST_COST) {
            orderAssigningSystem = new OrderAssigningByPrice(restaurants);
            orderAssigningSystem.assignOrder(cartItem, user);
        }
    }
}
