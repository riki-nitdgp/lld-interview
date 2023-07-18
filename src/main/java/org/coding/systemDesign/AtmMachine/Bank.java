package org.coding.systemDesign.AtmMachine;

import java.util.HashMap;

public class Bank {

    private String bankCode;

    private String ifscCode;

    private HashMap<String, Atm> atms;

    private HashMap<String, UserBankAccount> accounts;

    private HashMap<String, User> users;

    Bank(String bankCode, String ifscCode){
        this.ifscCode = ifscCode;
        this.bankCode = ifscCode;
        initialize();
    }

    private void initialize() {
        Atm atm = new Atm("123", 3500, 1,2,5);
        atms.put("123", atm);
        UserBankAccount userBankAccount = new UserBankAccount("1234", "Riki Mondal", 200);
        accounts.put("1234", userBankAccount);
        Card card = new Card("12345", 123, System.currentTimeMillis()+100000,
                "Valued Customer", 1234, userBankAccount);
        User user = new User("Riki Mondal", userBankAccount, card);

    }
}
