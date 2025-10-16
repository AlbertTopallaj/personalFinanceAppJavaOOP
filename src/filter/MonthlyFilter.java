package filter;

import java.time.LocalDate;


public class MonthlyFilter extends DateFilter {
    private int year;
    private int month;

    public MonthlyFilter(int year, int month) {
        this.year = year;
        this.month = month;
    }

    @Override
    protected boolean matches(LocalDate date) {
        return date.getYear() == year && date.getMonthValue() == month;
    }
}
