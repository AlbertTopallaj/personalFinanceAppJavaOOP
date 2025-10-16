package services;

import models.Transaction;

import java.util.ArrayList;

public class AccountBalanceService {

    private ArrayList<Transaction> transactions;

    public AccountBalanceService(ArrayList<Transaction> transactions){

        this.transactions = transactions;

    }

    public int getAccountBalance(){

        int sum = 0;

        for (Transaction transaction : transactions){

            sum += transaction.getAmount();

        }

        return sum;
    }

    public void printAccountBalance(){

        System.out.println("NUVARANDE KONTOBALANS " + getAccountBalance() + " kr");

    }

}
