package org.coding.systemDesign.parkingLot.spot;

import org.coding.systemDesign.parkingLot.Vehicle;

public class ParkingSpot {

    int id;
    boolean isEmpty;
    Vehicle vehicle;
    int price;

    public ParkingSpot(int id) {
        this.id = id;
        this.isEmpty = true;
        this.vehicle = null;
        this.price = 50;
    }

    public void parkVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void removeVehicle(){
        this.vehicle = null;
        this.isEmpty = true;
    }
}
