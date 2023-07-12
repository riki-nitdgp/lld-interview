package org.coding.systemDesign.vendingMachine.VendingState.impl;

import org.coding.systemDesign.vendingMachine.Coin;
import org.coding.systemDesign.vendingMachine.Item;
import org.coding.systemDesign.vendingMachine.VendingMachine;
import org.coding.systemDesign.vendingMachine.VendingState.State;

import java.util.ArrayList;
import java.util.List;

public class HasMoneyState implements State {

    public HasMoneyState(){
        System.out.println("Currently Vending machine is in HasMoneyState");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
        return;
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine vendingMachine) {
        vendingMachine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        vendingMachine.getCoinList().add(coin);
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productId) throws Exception{
        throw new Exception("you need to click on start product selection button first");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int productId) throws Exception {
        throw new Exception("you can not get product in hasMoney state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        return vendingMachine.getCoinList();

    }

    @Override
    public void clickOnCancelButton(VendingMachine vendingMachine) {
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
    }

    @Override
    public int getChange(int change) throws Exception {
        return 0;
    }
}
