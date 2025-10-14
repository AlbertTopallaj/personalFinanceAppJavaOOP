package filter;

import filter.ITransactionFilter;
import models.Transaction;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class DailyFilter implements ITransactionFilter {

    private LocalDate date;

    public DailyFilter(LocalDate date) {
        this.date = date;
    }

    @Override
    public List<Transaction> filter(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getDate().equals(date))
                .collect(Collectors.toList());
    }

    @Override
    public String getDescription(){

        return "Dag: " + date;

    }
}
