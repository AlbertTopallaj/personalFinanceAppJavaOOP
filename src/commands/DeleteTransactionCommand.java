package commands;

import models.Transaction;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteTransactionCommand extends Command {

    private ArrayList<Transaction> transactions;;

    public DeleteTransactionCommand(ArrayList<Transaction> transactions){

        super("RADERA", "Radera en befintlig transaktion");
        this.transactions = transactions;

    }
    @Override
    public void execute() {

        if (transactions.isEmpty()){

            System.out.println("Inga transaktioner att radera");
            return;

        }

            System.out.println("Vänligen välj transaktion att radera");
            for (Transaction transaction : transactions) {

                System.out.println(transaction);

            }



            Scanner scanner = new Scanner(System.in);
            int idMarked = scanner.nextInt();

            boolean found = false;

            for (Transaction transaction : transactions) {

                if (transaction.getID() == idMarked) {

                    transactions.remove(transaction);
                    System.out.println("Transaktion med ID" + idMarked + " har raderats");
                    found = true;
                    break;

                }
            }

            if (!found) {

                System.out.println("Ingen transaktion med ID " + idMarked + " hittades ");

            }

    }
}
