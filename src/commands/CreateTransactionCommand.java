package commands;

import models.Transaction;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class CreateTransactionCommand extends Command{

    private ArrayList<Transaction> transactions;
    private int nextID = 1;

    public CreateTransactionCommand(ArrayList<Transaction> transactions){

        super("SKAPA", "Skapa och spara en ny transaktion");
        this.transactions = transactions;

    }

    @Override
    public void execute(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange transaktionens värde i SEK");

        int ID = nextID++;

        int amount = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ange transaktionens beskrivning");
        String description = scanner.nextLine();

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = date.format(dateTimeFormatter);

        boolean isIncome = amount > 0;

        Transaction transaction = new Transaction(ID, amount, description, formattedDate, isIncome);
        transactions.add(transaction);

        System.out.println("Transaktion sparad: " + transaction);

    }
}
