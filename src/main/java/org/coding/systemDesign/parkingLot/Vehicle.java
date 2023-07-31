package org.coding.systemDesign.parkingLot;

import org.coding.systemDesign.parkingLot.VehicleType;

public class Vehicle {
    String number;
    VehicleType  vehicleType;

    public Vehicle(String number, VehicleType vehicleType) {
        this.number = number;
        this.vehicleType = vehicleType;
    }
}
