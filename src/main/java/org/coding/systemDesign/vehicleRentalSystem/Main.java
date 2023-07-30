package org.coding.systemDesign.vehicleRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    public static List<User> addUsers(){
        List<User> users = new ArrayList<>();
        User user1 = new User("12345", "98212", "Riki");
        User user2 = new User("8621", "21123", "Mondal");
        users.add(user1);
        users.add(user2);
        return users;
    }
}
