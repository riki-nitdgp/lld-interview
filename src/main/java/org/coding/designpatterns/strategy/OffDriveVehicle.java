package org.coding.designpatterns.strategy;

public class OffDriveVehicle extends Vehicle {

    OffDriveVehicle() {
        super(new SpecialDrive());
    }
}
