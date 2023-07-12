package org.coding.systemDesign.vendingMachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Inventory {
    HashMap<Integer, ItemShelf> itemInventory;

    Inventory(HashMap<Integer, ItemShelf> itemInventory){
        this.itemInventory = itemInventory;
    }

    public void addItem(int productCode, Item item, int count){
        ItemShelf itemShelf = itemInventory.get(productCode);
        if(itemShelf!=null){
            itemShelf.count +=count;
            if(itemShelf.isSoldOut) {
                itemShelf.isSoldOut = false;
            }
        }
        else {
            ItemShelf newItemShelf = new ItemShelf(item, count, false);
            itemInventory.put(productCode, newItemShelf);
        }
    }

    public void updateInventory(int productCode, int count) throws Exception {
        ItemShelf itemShelf = itemInventory.get(productCode);
        if(itemShelf!=null){
            itemShelf.count += count;
            if(count == 0){
                itemShelf.isSoldOut = true;
            }
        }else {
            throw new Exception("Invalid Product code");
        }
    }

    public Item getItem(int productCode) throws Exception {
        ItemShelf itemShelf = itemInventory.get(productCode);
        if(itemShelf!=null){
            if(itemShelf.isSoldOut || itemShelf.count == 0){
                throw new Exception("This Product is Sold out");
            } else {
                return itemShelf.item;
            }
        } else {
            throw new Exception("Invalid Product code");
        }
    }

    public List<HashMap<String, String>> displayInventory() {
        Set<Integer> productCodes = itemInventory.keySet();
        List<HashMap<String, String>> inventory = new ArrayList<>();
        for(int productCode: productCodes){
            HashMap<String, String> itemDetails = new HashMap<>();
            ItemShelf itemSelf = itemInventory.get(productCode);
            itemDetails.put("name", itemSelf.item.getName());
            itemDetails.put("price", Integer.toString(itemSelf.item.getPrice()));
            itemDetails.put("code", Integer.toString(productCode));
            itemDetails.put("quantity", Integer.toString(itemSelf.count));
            inventory.add(itemDetails);
        }
        return inventory;
    }


}
