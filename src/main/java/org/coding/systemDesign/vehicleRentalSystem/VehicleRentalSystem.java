package org.coding.systemDesign.vehicleRentalSystem;

import org.coding.systemDesign.vehicleRentalSystem.product.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {

    List<User> users;
    List<Store> stores;


    public VehicleRentalSystem(List<User> users, List<Store> stores) {
        this.users = users;
        this.stores = stores;
    }

    public List<Store> getStoreByCity(String city){
        List<Store> availableStores = new ArrayList<>();
        for(Store store: stores){
            if(store.location.city == city){
                availableStores.add(store);
            }
        }
        return availableStores;
    }
}
