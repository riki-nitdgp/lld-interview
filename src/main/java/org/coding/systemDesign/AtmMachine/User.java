package org.coding.systemDesign.AtmMachine;

public class User {

    private String name;
    private UserBankAccount bankAccount;
    private Card card;

    public User(String name, UserBankAccount bankAccount, Card card) {
        this.name = name;
        this.bankAccount = bankAccount;
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserBankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(UserBankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
