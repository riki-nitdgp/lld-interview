package org.coding.systemDesign.vendingMachine.VendingState.impl;

import org.coding.systemDesign.vendingMachine.Coin;
import org.coding.systemDesign.vendingMachine.Item;
import org.coding.systemDesign.vendingMachine.VendingMachine;
import org.coding.systemDesign.vendingMachine.VendingState.State;

import java.util.List;

public class DispenseState implements State {

    DispenseState(VendingMachine machine, int codeNumber) throws Exception{

        System.out.println("Currently Vending machine is in DispenseState");
        dispenseProduct(machine, codeNumber);
    }



    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("insert coin button can not clicked on Dispense state");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("can not clicked on Dispense state");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("can not clicked on Dispense state");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productId) throws Exception {
        throw new Exception("can not clicked on Dispense state");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int productId) throws Exception {
        Item item = vendingMachine.getInventory().getItem(productId);
        vendingMachine.getInventory().updateInventory(productId, -1);
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        System.out.println("Dispense Item Name: "+ item.getName());
        return item;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("can not clicked on Dispense state");
    }

    @Override
    public void clickOnCancelButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("can not clicked on Dispense state");
    }

    @Override
    public int getChange(int change) throws Exception {
        throw new Exception("can not clicked on Dispense state");
    }
}
