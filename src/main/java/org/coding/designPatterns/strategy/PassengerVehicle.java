package org.coding.designPatterns.strategy;

public class PassengerVehicle extends Vehicle{

    PassengerVehicle(){
        super(new NormalDrive());
    }
}
