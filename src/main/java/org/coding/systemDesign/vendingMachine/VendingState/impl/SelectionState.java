package org.coding.systemDesign.vendingMachine.VendingState.impl;

import org.coding.systemDesign.vendingMachine.Coin;
import org.coding.systemDesign.vendingMachine.Item;
import org.coding.systemDesign.vendingMachine.VendingMachine;
import org.coding.systemDesign.vendingMachine.VendingState.State;

import java.util.List;

public class SelectionState implements State {

    public SelectionState(){
        System.out.println("Currently Vending machine is in SelectionState");
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you can not click on insert coin button in Selection state");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine vendingMachine) {
        return;
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("you can not insert Coin in selection state");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productId) throws Exception {
        Item item = vendingMachine.getInventory().getItem(productId);
        int totalAmountPaid = 0;
        int itemPrice = item.getPrice();
        for(Coin coin: vendingMachine.getCoinList()){
            totalAmountPaid +=coin.value;
        }
        if(totalAmountPaid<itemPrice){
            System.out.println("Insufficient Amount, Product you selected is for price: " + item.getPrice() + " and you paid: " + totalAmountPaid);
            refundFullMoney(vendingMachine);
            throw new Exception("insufficient amount");

        } else if (totalAmountPaid >= itemPrice) {
            if(totalAmountPaid > item.getPrice()) {
                getChange(totalAmountPaid-item.getPrice());
            }
            vendingMachine.setVendingMachineState(new DispenseState(vendingMachine, productId));


        }

    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int productId) {
        return null;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) {
        return null;
    }

    @Override
    public void clickOnCancelButton(VendingMachine vendingMachine) {

    }

    @Override
    public int getChange(int returnExtraMoney) throws Exception {
        System.out.println("Returned the change in the Coin Dispense Tray: " + returnExtraMoney);
        return returnExtraMoney;

    }
}
