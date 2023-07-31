package org.coding.systemDesign.parkingLot;

import org.coding.systemDesign.parkingLot.spot.ParkingSpot;

public class Ticket {

    long entryTime;
    Vehicle vehicle;
    ParkingSpot parkingSpot;

    public Ticket(Vehicle vehicle, ParkingSpot parkingSpot) {
        this.entryTime = System.currentTimeMillis();
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }
}
