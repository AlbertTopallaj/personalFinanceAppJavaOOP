import commands.*;
import services.TransactionService;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ICommandService commandService = new TerminalCommandService();
        commandService.registerCommand(new CreateTransactionCommand());
        commandService.registerCommand(new ListTransactionsCommand());
        commandService.registerCommand(new DeleteTransactionCommand());
        commandService.registerCommand(new UpdateTransactionCommand());
        commandService.registerCommand(new ExitApplicationCommand());
        commandService.start();






    }
}