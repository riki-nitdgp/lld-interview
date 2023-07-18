package org.coding.systemDesign.AtmMachine.AtmState;

import org.coding.systemDesign.AtmMachine.Atm;
import org.coding.systemDesign.AtmMachine.Card;

public class CashWithDrawState extends AtmStates{

    public void cashWithdrawal(Atm atm, Card card, int withdrawAmount){
        int atmBalance = atm.getAtmBalance();
        if(withdrawAmount > atmBalance){
            System.out.println("Insufficient fund in the ATM Machine");
            exit(atm);
        } else if (withdrawAmount > card.getBankAccount().checkBalance()) {
            System.out.println("Insufficient fund in the your Bank Account");
            exit(atm);
        } else {
            card.getBankAccount().withdrawalBalance(withdrawAmount);
            atm.deductATMBalance(withdrawAmount);
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
