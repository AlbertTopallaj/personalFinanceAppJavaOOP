package commands;

import models.Transaction;
import services.AccountBalanceService;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class TerminalCommandService implements ICommandService{


    private ArrayList<Transaction> transactions;
    private final ArrayList<Command> commands;
    private AccountBalanceService balanceService;

    public TerminalCommandService(ArrayList<Transaction> transactions){

        this.transactions = transactions;
        this.commands = new ArrayList<>();
        this.balanceService = new AccountBalanceService(transactions);

    }

    @Override
    public void start(){

        while (true) {

        System.out.println("=== Personal Finance Application ===");
        System.out.println("Välkommen, vänligen välj ett av följande kommando");
        System.out.println();
        balanceService.printAccountBalance();
        System.out.println();
        for (Command command : commands){

            System.out.println(" " + command.getName() + " - " + command.getDescription());
        }

        Scanner scanner = new Scanner(System.in);

            System.out.println();
            System.out.println("ANGE KOMMANDO: ");
            String commandInput = scanner.nextLine();
            if (commandInput.equalsIgnoreCase("exit")){

                return;

            }
            try {

                executeCommand(commandInput);

            } catch (Exception exception) {

                exception.printStackTrace();
            }
        }
    }

    @Override
    public void registerCommand(Command command){

        this.commands.add(command);

    }

    @Override
    public void executeCommand(String commandInput){

        for (Command command : commands){

            if (command.getName().equalsIgnoreCase(commandInput)){

                command.execute();
                return;

            }

        }

        System.out.println("Kommando ej hittat");
    }


}
