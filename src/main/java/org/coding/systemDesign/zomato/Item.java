package org.coding.systemDesign.zomato;

public class Item {
    public Item(String name) {
        this.name = name;
    }

    String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name +
                '}';
    }
}
