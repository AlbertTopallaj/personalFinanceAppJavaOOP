package commands;

import jdk.jshell.execution.JdiExecutionControl;
import services.TransactionService;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class CreateTransactionCommand extends Command{


    public CreateTransactionCommand(){

        super("create-transaction", "Create and save a new todo");

    }

    @Override
    public void execute(){

        System.out.println("Create transaction");

    }

}
