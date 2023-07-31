package org.coding.systemDesign.parkingLot.spotmanager;

import org.coding.systemDesign.parkingLot.parkingstrategy.NearToEntranceGate;
import org.coding.systemDesign.parkingLot.parkingstrategy.ParkingStrategy;
import org.coding.systemDesign.parkingLot.spot.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{

    static List<ParkingSpot> parkingSpots = new ArrayList<>();
    public FourWheelerParkingSpotManager() {
        super(parkingSpots, new NearToEntranceGate());
    }
}
