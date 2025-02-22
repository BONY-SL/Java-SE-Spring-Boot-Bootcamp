package com.bank.app.model;
import com.bank.app.AccountType;


public class Account {

    private Integer accountID;
    private String ownerName;
    private AccountType accountType;
    private double currentBalance;

    public Account(){

    }

    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    @Override
    public String toString(){
        return "Account ID : "+this.getAccountID()+"\n"+
                "Account Name : "+this.getOwnerName()+"\n"+
                "Account Type : "+this.getAccountType()+"\n"+
                "Current Account Balance : "+this.getCurrentBalance();
    }
}
