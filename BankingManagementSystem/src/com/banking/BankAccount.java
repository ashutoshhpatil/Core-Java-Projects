package com.banking;

public class BankAccount {
    private final String accountHolderName;
    private final String accountNumber;
    private double balance;

    public BankAccount(String name,String no,double balance){
        this.accountHolderName=name;
        this.accountNumber=no;
        if(balance<=0){
            System.out.println("Initial Balance Can't be Zero");
        }else{
        this.balance=balance;
    }
    }

    public String getName(){ return accountHolderName; }

    public String getAccNo(){
        return accountNumber;

    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double depositAmount){
        if(depositAmount<=0){
            System.out.println("Invalid Amount");
        }else{
            balance += depositAmount;
            System.out.println("Deposit Successful");
            System.out.println("Deposited Amount: "+depositAmount);
        }
    }

    public void withdraw(double withdrawAmount){
        if(withdrawAmount<=0){
            System.out.println("Invalid Amount to Withdraw");
        }else if(withdrawAmount>balance){
            System.out.println("Insufficient Balance");
        }else {
            balance -= withdrawAmount;
            System.out.println("Withdrawl Successful");
            System.out.println("Withdrawl Amount: "+withdrawAmount);
        }
    }

    @Override
    public String toString(){
        return "Account Number: "+accountNumber+ "\n" +
                "Account Holder: "+accountHolderName+ "\n" +
                "Balance: "+balance;
    }
}

