package org.coding.design_patterns.strategy;

public class PassengerVehicle extends Vehicle{

    PassengerVehicle(){
        super(new NormalDrive());
    }
}
