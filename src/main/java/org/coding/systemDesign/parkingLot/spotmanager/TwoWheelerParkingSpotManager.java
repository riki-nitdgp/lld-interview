package org.coding.systemDesign.parkingLot.spotmanager;

import org.coding.systemDesign.parkingLot.parkingstrategy.DefaultParking;
import org.coding.systemDesign.parkingLot.parkingstrategy.ParkingStrategy;
import org.coding.systemDesign.parkingLot.spot.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager{
    static List<ParkingSpot> parkingSpots = new ArrayList<>();
    public TwoWheelerParkingSpotManager() {
        super(parkingSpots, new DefaultParking());
    }
}
