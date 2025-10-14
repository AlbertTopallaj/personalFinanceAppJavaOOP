package filter;

import filter.ITransactionFilter;
import models.Transaction;
import java.time.YearMonth;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class MonthlyFilter implements ITransactionFilter {

    private final YearMonth month;

    public MonthlyFilter(LocalDate date) {
        this.month = YearMonth.from(date);
    }

    @Override
    public List<Transaction> filter(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> YearMonth.from(t.getDate()).equals(month))
                .collect(Collectors.toList());
    }

    @Override
    public String getDescription() {
        return "Månad: " + month;
    }
}
