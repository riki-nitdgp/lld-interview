package org.coding.systemDesign.AtmMachine.AtmState;

import org.coding.systemDesign.AtmMachine.Atm;
import org.coding.systemDesign.AtmMachine.Card;
import org.coding.systemDesign.AtmMachine.TransactionType;

public class SelectOperationState extends AtmStates{

    public SelectOperationState(){
        showOperations();
    }


    @Override
    public void selectOperation(Atm atm, Card card, TransactionType txnType){
        switch (txnType) {
            case CASH_WITHDRAW :
                atm.setCurrentATMState(new CashWithDrawState());
                break;
            case BALANCE_ENQUIRY:
                atm.setCurrentATMState(new BalanceEnquiryState());
                break;
            default:
                System.out.println("Invalid Transaction Type");
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

    private void showOperations(){
        System.out.println("Please select the Operation");
        TransactionType.showAllTransactionTypes();
    }

}
