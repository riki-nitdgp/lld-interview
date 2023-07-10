package org.coding.design_patterns.strategy;

public class NormalDrive implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Normal Drive");
    }
}
