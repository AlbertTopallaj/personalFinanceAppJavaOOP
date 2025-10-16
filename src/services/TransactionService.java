package services;

import commands.*;
import models.Transaction;
import repository.DatabaseTransactionRepository;
import repository.FileTransactionRepository;
import repository.ITransactionRepository;

import java.util.ArrayList;
import java.util.List;

public class TransactionService {

    public void start(){

        ArrayList<Transaction> transactions = new ArrayList<>();

        ICommandService commandService = new TerminalCommandService(transactions);
        commandService.registerCommand(new CreateTransactionCommand(transactions));
        commandService.registerCommand(new ListTransactionsCommand(transactions));
        commandService.registerCommand(new DeleteTransactionCommand(transactions));
        commandService.registerCommand(new ExitApplicationCommand());
        commandService.start();

    }
}
