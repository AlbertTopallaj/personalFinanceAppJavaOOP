package filter;


import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Date;
import java.util.Locale;

public class WeeklyFilter extends DateFilter {

    private int year;
    private int week;

    public WeeklyFilter(int year, int week){

        this.year = year;
        this.week = week;


    }
    @Override
    protected boolean matches(LocalDate date) {

        WeekFields wf = WeekFields.of(Locale.getDefault());
        int weekOfYear = date.get(wf.weekOfYear());
        return date.getYear() == year && weekOfYear == week;

    }
}
