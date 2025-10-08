package interfaces;

import commands.ICommandService;

public class IntefaceCreateTransactionCommand implements ICommand {

    @Override
    public void execute(){

        System.out.println("Create todo");

    }

    @Override
    public String getName(){

        return "create-todo";

    }

    @Override
    public String getDescription(){

        return "Create and save a new todo";

    }
}
