package org.coding.design_patterns.strategy;

public class OffDriveVehicle extends Vehicle {

    OffDriveVehicle() {
        super(new SpecialDrive());
    }
}
