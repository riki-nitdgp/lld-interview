package org.coding.designpatterns.decorator;

import org.coding.designpatterns.decorator.pizza.BasePizza;
import org.coding.designpatterns.decorator.pizza.MargheritaPizza;
import org.coding.designpatterns.decorator.toppings.ExtraCheese;
import org.coding.designpatterns.decorator.toppings.Mushroom;

public class DecoratorPattern {

    public static void main(String[] args) {
        BasePizza basePizza = new ExtraCheese(new MargheritaPizza());
        System.out.println(basePizza.cost());
    }
}
