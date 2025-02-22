package com.bank.app;

import com.bank.app.service.BankService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 01. to Open Bank Account
        // 02. to deposit money
        // 03. to withdraw money
        // 04. to display bank account details
        // 05. to exit system

        BankService bankService = new BankService();

        while (true){
            System.out.println("*** Menu ***");
            System.out.println("[01] to Open Bank Account \n" +
                    "[02] to deposit money \n"+
                    "[03] to withdraw money \n"+
                    "[04] to display bank account details \n" +
                    "[05] to exit system\n");

            System.out.print("Enter Your Choice : ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Create New Bank Account");
                    bankService.createNewBankAccount();
                    break;
                case 2:
                    System.out.println("Select Deposit Money");
                    bankService.depositMoney();
                    break;
                case 3:
                    System.out.println("Select Withdraw Money");
                    bankService.withdrawMoney();
                    break;
                case 4:
                    System.out.println("Select View Account Details");
                    System.out.println(bankService.viewAccountDetails());
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please Enter Valid Input ");
            }
        }


    }
}