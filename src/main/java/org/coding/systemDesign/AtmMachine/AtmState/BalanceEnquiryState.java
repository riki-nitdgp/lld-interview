package org.coding.systemDesign.AtmMachine.AtmState;

import org.coding.systemDesign.AtmMachine.Atm;
import org.coding.systemDesign.AtmMachine.Card;

public class BalanceEnquiryState extends AtmStates{

    public void displayBalance(Atm atm, Card card){
        System.out.println("Your Balance is "+ card.getBankAccount().checkBalance());
        exit(atm);
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
