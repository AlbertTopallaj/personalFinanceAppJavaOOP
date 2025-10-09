package commands;

import models.Transaction;

import java.util.ArrayList;

public class ListTransactionsCommand extends Command {

    private ArrayList<Transaction> transactions = new ArrayList<>();

    public ListTransactionsCommand(ArrayList<Transaction> transactions){

        super("list-transactions", "List all created transactions");
        this.transactions = transactions;

    }

    @Override
    public void execute() {

        if (transactions.isEmpty()) {

            System.out.println("Inga transaktioner har skapats ännu");

        }

        else {

            System.out.println("Alla transaktioner: ");
            for (Transaction transaction : transactions){

                System.out.println(transaction);

            }

        }


    }
}
