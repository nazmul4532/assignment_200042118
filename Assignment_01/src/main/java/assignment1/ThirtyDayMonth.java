package assignment1;

public class ThirtyDayMonth extends Calendar{
    public ThirtyDayMonth(int day, int month, int year) {
        super(day, month, year);
        setMonthEnd(30);
    }
}
