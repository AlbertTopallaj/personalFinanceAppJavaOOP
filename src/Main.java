import commands.CreateTransactionCommand;
import models.SaveTransaction;
import services.TransactionService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        TransactionService transactionService = new TransactionService();
        SaveTransaction saveTransaction = new SaveTransaction();
        CreateTransactionCommand createTransactionCommand = new CreateTransactionCommand(transactionService, scanner);

        boolean running = true;

        while (running){

            System.out.println("\n--- Personal Finance App Java ---");
            System.out.println("1. Skapa ny transaktion");
            System.out.println("2. Visa alla transaktioner");
            System.out.println("3. Avsluta programmet");
            System.out.println("Välj ett alternativ: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){

                case 1:
                    createTransactionCommand.execute();
                    break;
                case 2:

                    break;
                case 3:
                    running = false;
                    System.out.println("Programmet avslutas");
                    break;
                default:
                    System.out.println("Ogiltigt val, försök igen");
            }

        }
        scanner.close();
    }
}