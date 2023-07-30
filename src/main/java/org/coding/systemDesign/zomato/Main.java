package org.coding.systemDesign.zomato;

public class Main {

    public static void main(String[] args) {
        FoodOrderingSystem foodOrderingSystem = new FoodOrderingSystem();
        Item vegBiryani = new Item("Veg Biryani");
        Item paneerButterMasala = new Item("Paneer Butter Masala");
        Item idli =  new Item("Idli");
        Item dosa = new Item("Dosa");
        Item gobiManchurian = new Item("Gobi Manchurian");

        Restaurant r1 = new Restaurant("R1", 5, 2);
        r1.addMenuItem(new Menu(vegBiryani, 100));
        r1.addMenuItem(new Menu(paneerButterMasala, 150));
        Restaurant r2 = new Restaurant("R2", 4, 0);
        r2.addMenuItem(new Menu(paneerButterMasala, 175));
        r2.addMenuItem(new Menu(idli, 10));
        r2.addMenuItem(new Menu(dosa, 50));
        r2.addMenuItem(new Menu(vegBiryani, 80));
        Restaurant r3 = new Restaurant("R3", 3, 1);
        r3.addMenuItem(new Menu(gobiManchurian, 150));
        r3.addMenuItem(new Menu(idli, 15));
        r3.addMenuItem(new Menu(dosa, 30));
        r3.addMenuItem(new Menu(paneerButterMasala, 175));
        foodOrderingSystem.addRestaurant(r1);
        foodOrderingSystem.addRestaurant(r2);
        foodOrderingSystem.addRestaurant(r3);
        User user1 = new User("Riki");
        foodOrderingSystem.addUser(user1);

        CartItem cartItem1 = new CartItem();
        cartItem1.addToCart(new Cart(idli, 3));
        cartItem1.addToCart(new Cart(dosa, 1));
        foodOrderingSystem.placeOrder(cartItem1, user1, SelectionCriteria.HIGHEST_RATING);
        foodOrderingSystem.placeOrder(cartItem1, user1, SelectionCriteria.LOWEST_COST);

    }


}
