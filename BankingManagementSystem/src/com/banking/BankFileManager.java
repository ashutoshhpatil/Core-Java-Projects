package com.banking;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.BufferedReader;

public class BankFileManager {
    private final String filePath = "D:\\CoreJavaProjects\\BankingManagementSystem\\accounts.txt";

    public void saveAccount(BankAccount account){
        try(FileWriter writer = new FileWriter(filePath,true)){
            writer.write(
                    account.getAccNo() + ", " +
                    account.getName()  + ", " + account.getBalance() +"\n"
            );
            System.out.println("Account Saved Successfully");
        }catch (IOException e){
            System.out.println("Error Saving Account : "+e.getMessage());
        }
    }

    public List<BankAccount> loadAccounts() {
        List<BankAccount> loadedAccounts = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                String accountNumber = data[0].trim();
                String accountName = data[1].trim();
                double balance = Double.parseDouble(data[2].trim());

                BankAccount account =
                        new BankAccount(accountName, accountNumber, balance);

                loadedAccounts.add(account);
            }

        } catch (IOException e) {
            System.out.println("Error loading accounts: " + e.getMessage());
        }

        return loadedAccounts;
    }

    public void saveAllAccounts(List<BankAccount> accounts){
        try(FileWriter writer = new FileWriter(filePath,true)){
            for(BankAccount account : accounts){
                writer.write(
                        account.getAccNo()+ ",  "+
                        account.getName()+ ",  "+
                                account.getBalance()+ "\n"
                );
            }
            System.out.println("All Accounts updated successfully");
        }catch (IOException e){
            System.out.println("Error Updating Accounts: "+e.getMessage());
        }

    }
}
