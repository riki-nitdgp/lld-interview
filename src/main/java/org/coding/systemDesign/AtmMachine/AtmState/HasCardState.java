package org.coding.systemDesign.AtmMachine.AtmState;

import org.coding.systemDesign.AtmMachine.Atm;
import org.coding.systemDesign.AtmMachine.Card;

public class HasCardState extends AtmStates {


    @Override
    public void authenticatePin(Atm atm, Card card, int pin){
        if(card.isCorrectPINEntered(pin)){
            atm.setCurrentATMState(new SelectOperationState());
        } else {
            System.out.println("Invalid Pin Entered");
            exit(atm);
        }

    }

    @Override
    public void exit(Atm atm){
        returnCard();
        atm.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard(){
        System.out.println("Please collect your card");
    }

}
