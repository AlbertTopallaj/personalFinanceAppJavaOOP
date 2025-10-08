package commands;

import java.util.ArrayList;
import java.util.Scanner;

public class TerminalCommandService implements ICommandService{

    private final ArrayList<Command> commands;

    public TerminalCommandService(){

        this.commands = new ArrayList<>();

    }

    @Override
    public void start(){

        System.out.println("=== Personal Finance Application ===");
        System.out.println("Välkommen, vänligen välj ett av följande kommando");
        for (Command command : commands){

            System.out.println(" " + command.getName() + " - " + command.getDescription());
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Enter command: ");
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
