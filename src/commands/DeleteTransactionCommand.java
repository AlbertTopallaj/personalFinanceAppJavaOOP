package commands;

import models.Transaction;

import java.util.ArrayList;

public class DeleteTransactionCommand extends Command {

    public DeleteTransactionCommand(ArrayList<Transaction> transactions){

        super("delete-transaction", "Remove transaction");

    }
    @Override
    public void execute() {

        System.out.println("Delete transaction");

    }
}
