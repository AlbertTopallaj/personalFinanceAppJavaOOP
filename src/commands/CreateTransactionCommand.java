package commands;

import models.CreateTransaction;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class CreateTransactionCommand extends CreateTransaction {

    public static void execute(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Skapa en ny transaktion");
        System.out.println("Ange belopp i SEK");
        int amount = scanner.nextInt();

        if (amount < 0){

            System.out.println("Spendering identifierad");
            LocalDate date = LocalDate.now();
            System.out.println("Ange beskrivning till transaktionen");
            String description = scanner.nextLine();
        } else {

            System.out.println("Inkomst identifierad");
            LocalDate date = LocalDate.now();
            System.out.println("Ange beskrivning till transaktionen");
            String description = scanner.nextLine();
        }


    }


}
