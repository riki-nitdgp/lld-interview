package org.coding.systemDesign.AtmMachine;

public enum TransactionType {
    BALANCE_ENQUIRY,
    CASH_WITHDRAW;

    public static void showAllTransactionTypes(){

        for(TransactionType type: TransactionType.values()){
            System.out.println(type.name());
        }
    }

    }
