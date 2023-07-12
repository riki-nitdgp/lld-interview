package org.coding.systemDesign.vendingMachine;

import org.coding.systemDesign.vendingMachine.VendingState.State;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.setCoinList(new ArrayList<>());

        try {
            System.out.println("Setting up inventory");
            initializeInventory(vendingMachine);
            System.out.println(vendingMachine.getInventory().displayInventory());

            System.out.println("|");
            System.out.println("clicking on InsertCoinButton");
            System.out.println("|");

            State vendingMachineState = vendingMachine.getVendingMachineState();
            vendingMachineState.clickOnInsertCoinButton(vendingMachine);
            vendingMachineState = vendingMachine.getVendingMachineState();
            vendingMachineState.insertCoin(vendingMachine, Coin.TEN);
            vendingMachineState.insertCoin(vendingMachine, Coin.TEN);
//            vendingMachineState.insertCoin(vendingMachine, Coin.TEN);

            System.out.println("|");
            System.out.println("clicking on ProductSelectionButton");
            System.out.println("|");

            vendingMachineState.clickOnSelectProductButton(vendingMachine);

            vendingMachineState = vendingMachine.getVendingMachineState();
            vendingMachineState.selectProduct(vendingMachine, 103);


        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void initializeInventory(VendingMachine vendingMachine) {
        Item drink = new Item("COKE", ItemType.COLD_DRINK, 20);
        Item water = new Item("BISELERI", ItemType.WATER_BOTTLE, 15);
        Item juice = new Item("REAL MANGO JUICE", ItemType.JUICE, 30);
        Item chips = new Item("LAYS", ItemType.CHIPS, 20);

        int itemCount = 10;

        ItemShelf drinkShelf = new ItemShelf(drink, itemCount, false);
        ItemShelf waterShelf = new ItemShelf(water, itemCount, false);
        ItemShelf juiceShelf = new ItemShelf(juice, itemCount, false);
        ItemShelf chipsShelf = new ItemShelf(chips, itemCount, false);
        HashMap<Integer, ItemShelf> store = new HashMap<>();
        store.put(101, drinkShelf);
        store.put(102, waterShelf);
        store.put(103, juiceShelf);
        store.put(104, chipsShelf);
        Inventory inventory = new Inventory(store);
        vendingMachine.setInventory(inventory);
    }
}
