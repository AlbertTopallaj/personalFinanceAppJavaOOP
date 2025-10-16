package commands;

import filter.TransactionPrinter;
import models.Transaction;
import services.TransactionFilterMenu;
import services.TransactionService;

import java.util.List;

public class ListTransactionsCommand extends Command {

    private final List<Transaction> transactions;
    private final TransactionPrinter printer;

    public ListTransactionsCommand(List<Transaction> transactions) {
        super("LISTA", "Få en lista på alla transaktioner");
        this.transactions = transactions;
        this.printer = new TransactionPrinter();

    }

    @Override
    public void execute() {
        if (transactions == null || transactions.isEmpty()) {
            System.out.println("Inga transaktioner att visa.");
            return;
        }

        TransactionFilterMenu menu = new TransactionFilterMenu();
        List<Transaction> filtered = menu.chooseFilter(transactions);

        if (filtered.isEmpty()) {
            System.out.println("Inga transaktioner matchar filtret.");
        } else {
            System.out.println("=== Filtrerade transaktioner ===");
            printer.print(filtered);
        }
    }
}

