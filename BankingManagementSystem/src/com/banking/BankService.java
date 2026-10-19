package com.banking;

import java.security.PublicKey;
import java.util.*;

public class BankService {
    private int nextAccountNumber = 1001;
    String mobNo;
    private List<BankAccount> accounts = new ArrayList<>();
    Scanner sc= new Scanner(System.in);

    BankFileManager fileHandler = new BankFileManager();

    public BankService(){
        accounts =  fileHandler.loadAccounts();

        for(BankAccount account : accounts){
            int currentNumber = Integer.parseInt(account.getAccNo());

            if(currentNumber>= nextAccountNumber){
                nextAccountNumber = currentNumber+1;
            }
        }
    }

    public void createAccount(){
        System.out.println("Enter Name: ");
        String name = sc.nextLine();

//        System.out.println("Enter Mobile Number: ");
//        mobNo = sc.next();
////        String mobile = String.valueOf(mobNo);
//        if(mobNo.length() != 10 || !mobNo.matches ("[0-9]{10}")) {
//            System.out.println(" Please Enter Correct Number");
//            return;
//        }else {
//            System.out.println("Mobile Number Saved Successfully");
//        }
//
//        System.out.println("Enter Identity Proof ID");
//        String id = sc.next();

        System.out.println("Add Initial Balance: ");
        double initialBalance =sc.nextDouble();
        if(initialBalance<=0){
            System.out.println("Please Enter Amount Greater than 0");
        }else {
            System.out.println("Balance Added Successfully");
        }

    String accNumber = String.valueOf(nextAccountNumber);
        BankAccount  account  = new BankAccount(name,accNumber,initialBalance);
        accounts.add(account);    /// adds account to the list collection

        fileHandler.saveAccount(account);        /// this is crated for saving the account details directly into the accounts.txt file

        nextAccountNumber++;      /// used to increment the account number starting with 1001 --> 1002

        System.out.println("Account Generated Successfully" + "\n" +
                          "Account Number: "+accNumber  + "\n" +
                           "Account Holder Name: "+name + "\n" +
                "Current Balance: "+initialBalance + "\n");
//                "Mobile Number: "+mobNo+ "\n" +
//                "Identity ID: "+id);



    }

    public  BankAccount findAccount(){
        System.out.println("Enter the Account Number to find the Account: ");
        String searchAccNo = sc.next();
        for(BankAccount s1: accounts){
            if( searchAccNo.equals(s1.getAccNo())){
                return s1;
            }
        }
        return null;
    }

    public void depositMoney(){
        BankAccount result  = findAccount();
        if(result==null){
            System.out.println("Account Not Found");
            return;
        }else {
            System.out.println("Enter the Amount to Deposit: ");
            double depositAmount = sc.nextDouble();
            result.deposit(depositAmount);
            fileHandler.saveAllAccounts(accounts);
        }

    }

}
