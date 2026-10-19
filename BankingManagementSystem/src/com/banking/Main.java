package com.banking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankService service = new BankService();

        Scanner sc= new Scanner(System.in);
        int choice;
        do{
            System.out.println("=========Banking Management System===========");
            System.out.println("---------------------------------");
            System.out.println("1. Create Account");
            System.out.println("2. Search Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.println("---------------------------------");

            System.out.println("Enter Your Choice");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    service.createAccount();
                    break;

                case 2:
                    BankAccount result = service.findAccount();
                    if(result == null){
                        System.out.println("Account Not Found");
                    }else {
                        System.out.println("Account Found :- Details are as follows");
                        System.out.println(result);
                    }
                    break;

                case 3:
                    service.depositMoney();
                    break;

                case 4:
                    System.out.println("Thank You for using our Bank");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }while (choice != 4);
}
}
