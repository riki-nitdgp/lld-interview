package org.coding.designPatterns.strategy;

public class Vehicle {

    private DriveStrategy strategy;

    Vehicle(DriveStrategy strategy) {
        this.strategy = strategy;
    }

    public void drive(){
        strategy.drive();
    }
}
