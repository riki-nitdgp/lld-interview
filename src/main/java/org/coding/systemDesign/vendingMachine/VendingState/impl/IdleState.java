package org.coding.systemDesign.vendingMachine.VendingState.impl;

import org.coding.systemDesign.vendingMachine.Coin;
import org.coding.systemDesign.vendingMachine.Item;
import org.coding.systemDesign.vendingMachine.VendingMachine;
import org.coding.systemDesign.vendingMachine.VendingState.State;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {

    public IdleState(){
        System.out.println("Currently Vending machine is in IdleState");
    }

    public IdleState(VendingMachine machine){
        System.out.println("Currently Vending machine is in IdleState");
        machine.setCoinList(new ArrayList<>());
    }


    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
        vendingMachine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productId) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int productId) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public void clickOnCancelButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public int getChange(int change) throws Exception {
        return 0;
    }
}
