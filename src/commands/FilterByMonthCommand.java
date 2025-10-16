package commands;

import filter.ITransactionFilter;
import filter.MonthlyFilter;
import filter.TransactionTypeFilter;
import interfaces.ICommand;
import interfaces.ITransactionRepository;
import models.Transaction;
import services.TransactionFilterService;

import java.util.List;
import java.util.Scanner;

public class FilterByMonthCommand implements ICommand {

    private ITransactionRepository repo;
    private TransactionFilterService filterService;
    private Scanner scanner = new Scanner(System.in);

    public FilterByMonthCommand(ITransactionRepository repo, TransactionFilterService filterService){

        this.repo = repo;
        this.filterService = filterService;

    }

    @Override
    public void execute(){

        System.out.println("ANGE ÅR: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("ANGE MÅNAD (1-12) ");
        int month = Integer.parseInt(scanner.nextLine());

        var filter = new MonthlyFilter(year, month);
        List<Transaction> result = filterService.applyFilter(repo.getAllTransactions(), filter);

        if (result.isEmpty()){

            System.out.println("Inga transaktioner hittades för " + year + "-" + month + ".");

        } else {

            result.forEach(System.out::println);

            }

        }

       @Override
       public String getName() {

        return "filter-month";

       }

    @Override
    public String getDescription() {
        return "FILTERA UTIFRÅN MÅNAD";
    }
}
