package org.coding.systemDesign.parkingLot;

import org.coding.systemDesign.parkingLot.spot.ParkingSpot;
import org.coding.systemDesign.parkingLot.spotmanager.ParkingSpotManager;
import org.coding.systemDesign.parkingLot.spotmanager.ParkingSpotManagerFactory;

public class EntranceGate {

    String gateNumber;

    public EntranceGate(String gateNumber) {
        this.gateNumber = gateNumber;
    }


    ParkingSpotManagerFactory parkingSpotManagerFactory;


    public ParkingSpot findFreeSpace(VehicleType vehicleType) {
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(vehicleType);
        return parkingSpotManager.findParkingSpot(vehicleType, gateNumber);
    }

    public Ticket bookParkingSpace(ParkingSpot parkingSpot, Vehicle vehicle) {
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(vehicle.vehicleType);
        parkingSpotManager.parkVehicle(vehicle, parkingSpot);
        return generateTicket(parkingSpot,  vehicle);
    }

    private Ticket generateTicket(ParkingSpot parkingSpot, Vehicle vehicle) {
        return new Ticket(vehicle, parkingSpot);
    }

}
