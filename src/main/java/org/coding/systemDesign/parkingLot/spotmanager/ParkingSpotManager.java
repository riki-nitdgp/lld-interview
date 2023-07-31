package org.coding.systemDesign.parkingLot.spotmanager;

import org.coding.systemDesign.parkingLot.VehicleType;
import org.coding.systemDesign.parkingLot.parkingstrategy.ParkingStrategy;
import org.coding.systemDesign.parkingLot.spot.ParkingSpot;
import org.coding.systemDesign.parkingLot.Vehicle;

import java.util.List;

public class ParkingSpotManager {
    List<ParkingSpot> parkingSpots;

    ParkingStrategy parkingStrategy;

    public ParkingSpotManager(List<ParkingSpot> parkingSpots, ParkingStrategy parkingStrategy) {
        this.parkingSpots = parkingSpots;
        this.parkingStrategy = parkingStrategy;
    }

    public ParkingSpot findParkingSpot(VehicleType vehicleType, String gateNumber){
        return this.parkingStrategy.find(vehicleType, gateNumber);
    }

    public void addParkingSpot(ParkingSpot parkingSpot){
        this.parkingSpots.add(parkingSpot);
    }

    public void removeParkingSpace(ParkingSpot parkingSpot){
        this.parkingSpots.remove(parkingSpot);
    }

    public void parkVehicle(Vehicle vehicle, ParkingSpot parkingSpot){
        parkingSpot.parkVehicle(vehicle);
    }

    public void removeVehicle(ParkingSpot parkingSpot) {
        parkingSpot.removeVehicle();
    }
}
