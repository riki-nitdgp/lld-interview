package org.coding.designpatterns.decorator.toppings;

import org.coding.designpatterns.decorator.pizza.BasePizza;

public class Mushroom extends ToppingDecorator{
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 90;
    }
}
