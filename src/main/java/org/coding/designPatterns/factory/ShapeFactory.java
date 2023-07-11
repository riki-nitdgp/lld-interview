package org.coding.designPatterns.factory;

public class ShapeFactory {

    public Shape getShape(String shape){
       switch (shape) {

           case "CIRCLE":
               return new Circle();
           case "RECTANGLE":
               return new Rectangle();
           default:
               throw new RuntimeException("No Such Shape");
       }

    }
}
