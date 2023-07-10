package org.coding.designpatterns.strategy;

public class PassengerVehicle extends Vehicle{

    PassengerVehicle(){
        super(new NormalDrive());
    }
}
