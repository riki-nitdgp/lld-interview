package org.coding.design_patterns.strategy;

public class SpecialDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Special Drive");
    }
}
