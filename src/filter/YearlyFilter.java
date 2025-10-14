package filter;

import filter.ITransactionFilter;
import models.Transaction;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class YearlyFilter implements ITransactionFilter {

    private final int year;

    public YearlyFilter(LocalDate date) {
        this.year = date.getYear();
    }

    @Override
    public List<Transaction> filter(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getDate().getYear() == year)
                .collect(Collectors.toList());
    }

    @Override
    public String getDescription() {
        return "Året: " + year;
    }
}
