package commands;

import models.Transaction;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CreateTransactionCommand extends Command{

    private ArrayList<Transaction> transactions = new ArrayList<>();

    public CreateTransactionCommand(ArrayList<Transaction> transactions){

        super("create-transaction", "Create and save a new transaction");

    }

    @Override
    public void execute(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange transaktionens värde i SEK");
        int amount = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ange transaktionens beskrivning");
        String description = scanner.nextLine();

        LocalDate date = LocalDate.now();

        Transaction transaction = new Transaction(amount, description, date);
        transactions.add(transaction);

        System.out.println("Transaktion sparad: " + transaction);

    }
}
