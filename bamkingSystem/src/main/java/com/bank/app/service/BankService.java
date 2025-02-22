package com.bank.app.service;

import com.bank.app.AccountType;
import com.bank.app.model.Account;
import java.util.ArrayList;
import java.util.Scanner;

public class BankService {

    ArrayList<Account> accountArrayList = new ArrayList<>();

    public BankService() {

    }

    public void createNewBankAccount() {

        Account newAccount = new Account();

        System.out.print("Enter Account Number :");
        newAccount.setAccountID(new Scanner(System.in).nextInt());

        System.out.print("Enter Your Name :");
        newAccount.setOwnerName(new Scanner(System.in).nextLine());

        System.out.print("[1].saving account \n[2].current account\n[3].mobile account \n");

        System.out.print("Enter Account Type (Please Select Type Number) :");
        int typeValue = new Scanner(System.in).nextInt();
        if(typeValue == 1){
            newAccount.setAccountType(AccountType.SAVING);
        } else if (typeValue == 2) {
            newAccount.setAccountType(AccountType.CURRENT);
        } else if (typeValue == 3) {
            newAccount.setAccountType(AccountType.MOBILE);
        }

        System.out.print("Enter Amount of Money for Open Account : ");
        newAccount.setCurrentBalance(new Scanner(System.in).nextDouble());

        accountArrayList.add(newAccount);
        System.out.println("Successfully Create Your Account");
    }

    public void depositMoney() {

        System.out.print("Enter Your Account Number: ");
        Integer getAccountNumber = new Scanner(System.in).nextInt();

        Account foundAccount = findAccountByNumber(getAccountNumber);
        if (foundAccount == null) return;

        System.out.print("Enter Your Deposit Amount: ");
        double amount = new Scanner(System.in).nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
            return;
        }

        foundAccount.setCurrentBalance(foundAccount.getCurrentBalance() + amount);
        System.out.println("Deposit Successful. Updated Balance: " + foundAccount.getCurrentBalance());
    }

    public void withdrawMoney() {

        System.out.print("Enter Your Account Number: ");
        Integer getAccountNumber = new Scanner(System.in).nextInt();

        Account foundAccount = findAccountByNumber(getAccountNumber);
        if (foundAccount == null) return;

        System.out.print("Enter Your Withdraw Amount: ");
        double amount = new Scanner(System.in).nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }

        if (foundAccount.getCurrentBalance() < amount) {
            System.out.println("Insufficient funds. Your balance is: " + foundAccount.getCurrentBalance());
            return;
        }

        foundAccount.setCurrentBalance(foundAccount.getCurrentBalance() - amount);
        System.out.println("Withdrawal Successful. Updated Balance: " + foundAccount.getCurrentBalance());
    }

    public Account viewAccountDetails() {

        System.out.print("Enter Your Account Number: ");
        Integer getAccountNumber = new Scanner(System.in).nextInt();

        return findAccountByNumber(getAccountNumber);
    }

    private Account findAccountByNumber(Integer accountNumber) {
        if (accountArrayList == null || accountArrayList.isEmpty()) {
            System.out.println("No accounts available.");
            return null;
        }

        for (Account account : accountArrayList) {
            if (account.getAccountID().equals(accountNumber)) {
                return account;
            }
        }

        System.out.println("Account not found. Please check the account number.");
        return null;
    }

}
