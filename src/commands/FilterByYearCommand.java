package commands;

import filter.TransactionPrinter;
import models.Transaction;
import services.TransactionFilterService;
import services.TransactionService;

import java.util.List;


public class FilterByYearCommand extends Command {

    private final List<Transaction> transactions;
    private final TransactionPrinter printer;
    private final TransactionService filterService;
    private final int year;


    public FilterByYearCommand(List<Transaction> transactions,
                               TransactionPrinter printer,
                               TransactionService filterService,
                               int year) {
        super("filter-by-year", "Filter transactions by year");
        this.transactions = transactions;
        this.printer = printer;
        this.filterService = filterService;
        this.year = year;

    }

    @Override
    public void execute(){

        List<Transaction> filtered = filterService.filterByYear(transactions, year);
        printer.print(filtered);

    }
}
