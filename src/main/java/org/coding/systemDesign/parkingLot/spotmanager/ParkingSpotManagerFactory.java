package org.coding.systemDesign.parkingLot.spotmanager;

import org.coding.systemDesign.parkingLot.VehicleType;

public class ParkingSpotManagerFactory {

    public ParkingSpotManager getParkingSpotManager(VehicleType vehicleType) {
        switch (vehicleType){
            case TWO_WHEELER:
                return new TwoWheelerParkingSpotManager();
            case FOUR_WHEELER:
                return new FourWheelerParkingSpotManager();
            default:
                throw new RuntimeException("Not a valid vehicle type");
        }
    }
}
