package filter;

import filter.ITransactionFilter;
import models.Transaction;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class WeeklyFilter implements ITransactionFilter {

    private final int week;
    private final int year;

    public WeeklyFilter(LocalDate date) {
        WeekFields wf = WeekFields.of(Locale.getDefault());
        this.week = date.get(wf.weekOfYear());
        this.year = date.getYear();
    }

    @Override
    public List<Transaction> filter(List<Transaction> transactions) {
        WeekFields wf = WeekFields.of(Locale.getDefault());
        return transactions.stream()
                .filter(t -> t.getDate().getYear() == year &&
                        t.getDate().get(wf.weekOfYear()) == week)
                .collect(Collectors.toList());
    }

    @Override
    public String getDescription() {
       return "Vecka " + week;
    }
}
