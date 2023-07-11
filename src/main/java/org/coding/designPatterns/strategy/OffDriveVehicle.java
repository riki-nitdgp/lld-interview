package org.coding.designPatterns.strategy;

public class OffDriveVehicle extends Vehicle {

    OffDriveVehicle() {
        super(new SpecialDrive());
    }
}
