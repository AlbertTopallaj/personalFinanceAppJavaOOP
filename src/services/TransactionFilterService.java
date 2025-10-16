package services;

import filter.*;
import models.Transaction;

import java.time.LocalDate;
import java.util.List;

public class TransactionFilterService {

    public List<Transaction> applyFilter(List<Transaction> transactions, ITransactionFilter filter) {
        return filter.filter(transactions);
    }

    public List<Transaction> filterByYear(List<Transaction> transactions, int year) {
        return applyFilter(transactions, new YearlyFilter(year));
    }

    public List<Transaction> filterByMonth(List<Transaction> transactions, int year, int month) {
        return applyFilter(transactions, new MonthlyFilter(year, month));
    }

    public List<Transaction> filterByWeek(List<Transaction> transactions, int year, int week) {
        return applyFilter(transactions, new WeeklyFilter(year, week));
    }

    public List<Transaction> filterByDay(List<Transaction> transactions, LocalDate date) {
        return applyFilter(transactions, new DailyFilter(date));
    }

    public List<Transaction> filterByIncome(List<Transaction> transactions) {
        return applyFilter(transactions, new TransactionTypeFilter(true));
    }

    public List<Transaction> filterByExpense(List<Transaction> transactions) {
        return applyFilter(transactions, new TransactionTypeFilter(false));
    }
}
