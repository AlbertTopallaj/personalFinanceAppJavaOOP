package commands;

import filter.TransactionPrinter;
import filter.ITransactionFilter;
import interfaces.ITransactionRepository;
import models.Transaction;

import java.util.ArrayList;
import java.util.List;

public class ListTransactionsCommand extends Command {

    private final List<Transaction> transactions;
    private final TransactionPrinter printer;

    public ListTransactionsCommand(List<Transaction> transactions, TransactionPrinter printer) {
        super("list-transactions", "List all transactions with filter");
        this.transactions = transactions;
        this.printer = printer;

    }

    @Override
    public void execute(){

        printer.print(transactions);

    }

}
