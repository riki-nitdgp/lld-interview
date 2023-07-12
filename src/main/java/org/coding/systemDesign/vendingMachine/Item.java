package org.coding.systemDesign.vendingMachine;


public class Item {

    String name;
    ItemType type;
    int price;

    Item(String name, ItemType type, int price) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }




}
