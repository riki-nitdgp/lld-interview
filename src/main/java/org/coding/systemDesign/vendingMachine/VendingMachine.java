package org.coding.systemDesign.vendingMachine;

import org.coding.systemDesign.vendingMachine.VendingState.State;
import org.coding.systemDesign.vendingMachine.VendingState.impl.IdleState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private State vendingMachineState;
    private Inventory inventory;
    private List<Coin> coins;

    VendingMachine(){
        vendingMachineState = new IdleState();
        coins = new ArrayList<>();
    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public List<Coin> getCoinList() {
        return coins;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coins = coinList;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
