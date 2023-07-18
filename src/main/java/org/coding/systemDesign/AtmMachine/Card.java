package org.coding.systemDesign.AtmMachine;


public class Card {

    private String cardNumber;
    private Integer cvv;
    private long expiry;

    private String cardHolderName;
    private Integer pin;

    private UserBankAccount bankAccount;

    public Card(String cardNumber, Integer cvv, long expiry, String cardHolderName, Integer pin,
                UserBankAccount bankAccount) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiry = expiry;
        this.cardHolderName = cardHolderName;
        this.pin = pin;
        this.bankAccount = bankAccount;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public void setExpiry(long expiry) {
        this.expiry = expiry;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public void setBankAccount(UserBankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public UserBankAccount getBankAccount() {
     return bankAccount;
    }

    public boolean isCorrectPINEntered(int pin){
        return this.pin == pin;
    }
}
