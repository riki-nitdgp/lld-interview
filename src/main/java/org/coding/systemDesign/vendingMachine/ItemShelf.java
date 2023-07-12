package org.coding.systemDesign.vendingMachine;

import java.util.List;

public class ItemShelf {
    Item item;
    int count;
    boolean isSoldOut;

    ItemShelf(Item item, int count, boolean isSoldOut) {
        this.item = item;
        this.count = count;
        this.isSoldOut = isSoldOut;
    }
}
