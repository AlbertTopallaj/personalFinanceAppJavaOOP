package filter;

import models.Transaction;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public abstract class DateFilter implements ITransactionFilter {

    protected abstract boolean matches (LocalDate date);

    @Override
    public List<Transaction> filter (List<Transaction> transactions){

        return transactions.stream()
                .filter(t -> matches(LocalDate.from(t.getDate())))
                .collect(Collectors.toList());

    }
}
