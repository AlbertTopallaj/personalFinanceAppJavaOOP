import commands.*;
import models.Transaction;
import services.TransactionService;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Transaction> transactions = new ArrayList<>();

        ICommandService commandService = new TerminalCommandService();

        commandService.registerCommand(new CreateTransactionCommand(transactions));
        commandService.registerCommand(new ListTransactionsCommand(transactions));
        commandService.registerCommand(new DeleteTransactionCommand(transactions));
        commandService.registerCommand(new UpdateTransactionCommand(transactions));
        commandService.registerCommand(new ExitApplicationCommand());
        commandService.start();

    }
}