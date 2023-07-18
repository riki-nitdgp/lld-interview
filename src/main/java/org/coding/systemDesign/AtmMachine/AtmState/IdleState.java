package org.coding.systemDesign.AtmMachine.AtmState;

import org.coding.systemDesign.AtmMachine.Atm;
import org.coding.systemDesign.AtmMachine.Card;

public class IdleState extends AtmStates{

    @Override
    public void insertCard(Atm atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}
