package org.coding.systemDesign.AtmMachine.AtmState;

import org.coding.systemDesign.AtmMachine.Atm;
import org.coding.systemDesign.AtmMachine.Card;
import org.coding.systemDesign.AtmMachine.TransactionType;

public abstract class AtmStates {

    public void insertCard(Atm atm, Card card) {
        System.out.println("OOPS!! Something went wrong");
    }

    public void authenticatePin(Atm atm, Card card, int pin){
        System.out.println("OOPS!! Something went wrong");
    }

    public void selectOperation(Atm atm, Card card, TransactionType txnType){
        System.out.println("OOPS!! Something went wrong");
    }

    public void cashWithdrawal(Atm atm, Card card, int withdrawAmount){
        System.out.println("OOPS!! Something went wrong");
    }

    public void displayBalance(Atm atm, Card card){
        System.out.println("OOPS!! Something went wrong");
    }

    public void returnCard(){
        System.out.println("OOPS!! Something went wrong");
    }

    public void exit(Atm atm){
        System.out.println("OOPS!! Something went wrong");
    }


}
