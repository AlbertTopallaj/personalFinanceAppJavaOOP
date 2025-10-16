package filter;

import models.Transaction;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class YearlyFilter extends DateFilter {

    private int year;

    public YearlyFilter(int year){

        this.year = year;

    }

    @Override
    protected boolean matches(LocalDate date){

        return date.getYear() == year;

    }

}
