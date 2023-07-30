package org.coding.systemDesign.vehicleRentalSystem.inventoryService;

import org.coding.systemDesign.vehicleRentalSystem.product.Vehicle;
import org.coding.systemDesign.vehicleRentalSystem.product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventory {

    List<Vehicle> vehicles;

    public VehicleInventory(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles(VehicleType vehicleType) {
       List<Vehicle> availableVehicle = new ArrayList<>();
       for(Vehicle vehicle: vehicles){
           if(vehicle.isAvailable() && vehicle.getVehicleType()==vehicleType){
               availableVehicle.add(vehicle);
           }
       }
       return availableVehicle;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
}
