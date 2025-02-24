package com.bank.app.service;

import com.bank.app.AccountType;
import com.bank.app.model.Account;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class BankService {

    ArrayList<Account> accountArrayList = new ArrayList<>();
    Logger logger = Logger.getLogger(getClass().getName());

    public void createNewBankAccount() {

        Account newAccount = new Account();

        logger.info("Enter Account Number :");
        newAccount.setAccountID(new Scanner(System.in).nextInt());

        logger.info("Enter Your Name :");
        newAccount.setOwnerName(new Scanner(System.in).nextLine());

        logger.info("[1].saving account \n[2].current account\n[3].mobile account \n");

        logger.info("Enter Account Type (Please Select Type Number) :");
        int typeValue = new Scanner(System.in).nextInt();
        if(typeValue == 1){
            newAccount.setAccountType(AccountType.SAVING);
        } else if (typeValue == 2) {
            newAccount.setAccountType(AccountType.CURRENT);
        } else if (typeValue == 3) {
            newAccount.setAccountType(AccountType.MOBILE);
        }

        logger.info("Enter Amount of Money for Open Account : ");
        newAccount.setCurrentBalance(new Scanner(System.in).nextDouble());

        accountArrayList.add(newAccount);
        logger.info("Successfully Create Your Account");
    }

    public void depositMoney() {

        logger.info("Enter Your Account Number: ");
        Integer getAccountNumber = new Scanner(System.in).nextInt();

        Account foundAccount = findAccountByNumber(getAccountNumber);
        if (foundAccount == null) return;

        logger.info("Enter Your Deposit Amount: ");
        double amount = new Scanner(System.in).nextDouble();

        if (amount <= 0) {
            logger.info("Invalid deposit amount. Please enter a positive value.");
            return;
        }

        foundAccount.setCurrentBalance(foundAccount.getCurrentBalance() + amount);
        logger.info("Deposit Successful. Updated Balance: " + foundAccount.getCurrentBalance());
    }

    public void withdrawMoney() {

        logger.info("Enter Your Account Number: ");
        Integer getAccountNumber = new Scanner(System.in).nextInt();

        Account foundAccount = findAccountByNumber(getAccountNumber);
        if (foundAccount == null) return;

        logger.info("Enter Your Withdraw Amount: ");
        double amount = new Scanner(System.in).nextDouble();

        if (amount <= 0) {
            logger.info("Invalid withdrawal amount.");
            return;
        }

        if (foundAccount.getCurrentBalance() < amount) {
            logger.info("Insufficient funds. Your balance is: " + foundAccount.getCurrentBalance());
            return;
        }

        foundAccount.setCurrentBalance(foundAccount.getCurrentBalance() - amount);
        logger.info("Withdrawal Successful. Updated Balance: " + foundAccount.getCurrentBalance());
    }

    public Account viewAccountDetails() {

        logger.info("Enter Your Account Number: ");
        Integer getAccountNumber = new Scanner(System.in).nextInt();

        return findAccountByNumber(getAccountNumber);
    }

    private Account findAccountByNumber(Integer accountNumber) {
        if (accountArrayList == null || accountArrayList.isEmpty()) {
            logger.info("No accounts available.");
            return null;
        }

        for (Account account : accountArrayList) {
            if (account.getAccountID().equals(accountNumber)) {
                return account;
            }
        }

        logger.info("Account not found. Please check the account number.");
        return null;
    }

}
