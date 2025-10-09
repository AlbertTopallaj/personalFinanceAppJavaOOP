package commands;

import models.Transaction;

import java.util.ArrayList;

public class UpdateTransactionCommand extends Command{

    public UpdateTransactionCommand(ArrayList<Transaction> transactions){

        super("update-transaction", "Update transaction");

    }

    @Override
    public void execute(){

        System.out.println("Update transaction");

    }
}
