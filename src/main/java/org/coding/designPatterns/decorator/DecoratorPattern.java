package org.coding.designPatterns.decorator;

import org.coding.designPatterns.decorator.pizza.BasePizza;
import org.coding.designPatterns.decorator.pizza.MargheritaPizza;
import org.coding.designPatterns.decorator.toppings.ExtraCheese;

public class DecoratorPattern {

    public static void main(String[] args) {
        BasePizza basePizza = new ExtraCheese(new MargheritaPizza());
        System.out.println(basePizza.cost());
    }
}
