package org.coding.design_patterns.decorator;

import org.coding.design_patterns.decorator.pizza.BasePizza;
import org.coding.design_patterns.decorator.pizza.MargheritaPizza;
import org.coding.design_patterns.decorator.toppings.ExtraCheese;

public class DecoratorPattern {

    public static void main(String[] args) {
        BasePizza basePizza = new ExtraCheese(new MargheritaPizza());
        System.out.println(basePizza.cost());
    }
}
