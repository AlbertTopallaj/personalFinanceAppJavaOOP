package commands;

import filter.TransactionTypeFilter;
import interfaces.ICommand;
import interfaces.ITransactionRepository;
import models.Transaction;
import services.TransactionFilterService;

import java.util.List;

public class FilterByIncomeCommand implements ICommand {
    private ITransactionRepository repo;
    private TransactionFilterService filterService;

    public FilterByIncomeCommand(ITransactionRepository repo, TransactionFilterService filterService) {
        this.repo = repo;
        this.filterService = filterService;
    }

    @Override
    public void execute() {
        var filter = new TransactionTypeFilter(true);
        List<Transaction> incomes = filterService.applyFilter(repo.getAllTransactions(), filter);

        if (incomes.isEmpty()) {
            System.out.println("Inga inkomster hittades.");
        } else {
            System.out.println("Inkomster:");
            incomes.forEach(System.out::println);
        }
    }

    @Override
    public String getName() {
        return "filter-income";
    }

    @Override
    public String getDescription() {
        return "FILTERA INKOMST ";
    }
}