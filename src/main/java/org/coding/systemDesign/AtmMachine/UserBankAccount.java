package org.coding.systemDesign.AtmMachine;

public class UserBankAccount {

    private String accountNumber;
    private String customerName;
    private int balance;


    public UserBankAccount(String accountNumber, String customerName, int balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public void withdrawalBalance(int amount) {
        balance = balance - amount;
    }

    public void addBalance(int amount) {
        balance = balance + amount;
    }

    public int checkBalance() {
        return balance;
    }
}
