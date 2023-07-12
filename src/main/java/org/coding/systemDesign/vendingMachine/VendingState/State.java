package org.coding.systemDesign.vendingMachine.VendingState;

import org.coding.systemDesign.vendingMachine.Coin;
import org.coding.systemDesign.vendingMachine.Item;
import org.coding.systemDesign.vendingMachine.VendingMachine;

import java.util.List;

public interface State {

    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;

    public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception;

    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;

    public void selectProduct(VendingMachine vendingMachine, int productId) throws Exception;

    public Item dispenseProduct(VendingMachine vendingMachine, int productId) throws Exception;

    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception;

    void clickOnCancelButton(VendingMachine vendingMachine) throws Exception;

    int getChange(int change) throws Exception;
}
