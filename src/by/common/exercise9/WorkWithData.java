package by.common.exercise9;

import java.time.LocalDate;

public class WorkWithData {
    private int day;
    private int month;
    private int year;
    private LocalDate date;

    public WorkWithData(int day, int month, int year) {
        date = LocalDate.of(year,month,day);
    }

    public LocalDate nextDay() {
        date = date.plusDays(1);
        return date;
    }
}
