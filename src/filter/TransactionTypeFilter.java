package filter;

import models.Transaction;

import java.util.List;
import java.util.stream.Collectors;

public class TransactionTypeFilter implements ITransactionFilter {

    private boolean income;

    public TransactionTypeFilter(boolean income){

        this.income = income;

    }

    @Override
    public List<Transaction> filter(List<Transaction> transactions){

        return transactions.stream()
                .filter(t -> t.isIncome() == income)
                .collect(Collectors.toList());

    }

}
