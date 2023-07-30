package org.coding.systemDesign.vehicleRentalSystem;

import org.coding.systemDesign.vehicleRentalSystem.inventoryService.VehicleInventory;
import org.coding.systemDesign.vehicleRentalSystem.product.Vehicle;
import org.coding.systemDesign.vehicleRentalSystem.product.VehicleType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Store {

    String storeId;
    VehicleInventory vehicleInventory;
    Location location;

    HashMap<Integer, Reservation> reservations = new HashMap<>();

    public Store(String storeId, Location location) {
        this.storeId = storeId;
        this.location = location;
    }

    public List<Vehicle> getVehicles(VehicleType vehicleType) {

        return vehicleInventory.getVehicles(vehicleType);
    }

    public void setVehicles(List<Vehicle> vehicles) {
        vehicleInventory = new VehicleInventory(vehicles);
    }

    public void completeReservation(Integer reservationId) {
        Reservation reservation = reservations.get(reservationId);
        reservation.reservationStatus = ReservationStatus.COMPLETE;
        Vehicle currentVehicle = reservation.vehicle;
        currentVehicle.setAvailable(true);
    }

    public void createReservation(Reservation reservation) {
        reservations.put(reservation.reservationId, reservation);
    }


}
