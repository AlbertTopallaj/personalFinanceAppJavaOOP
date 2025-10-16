package filter;

import filter.ITransactionFilter;
import models.Transaction;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class DailyFilter extends DateFilter {

    private LocalDate targetDate;

    public DailyFilter(LocalDate targetDate){

        this.targetDate = targetDate;

    }

    @Override
    protected boolean matches(LocalDate date){

        return date.equals(targetDate);

    }

}
