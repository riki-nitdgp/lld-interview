package org.coding.designpatterns.factory;

public class FactoryPattern {

    public static void main(String[] args) {

        ShapeFactory shapeFactoryObj = new ShapeFactory();
        Shape circle = shapeFactoryObj.getShape("CIRCLE");
        circle.draw();

    }
}
