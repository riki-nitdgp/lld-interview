package org.coding.systemDesign.parkingLot.parkingstrategy;

import org.coding.systemDesign.parkingLot.VehicleType;
import org.coding.systemDesign.parkingLot.spot.ParkingSpot;

public interface ParkingStrategy {

    ParkingSpot find(VehicleType vehicleType, String gateNumber);
}
