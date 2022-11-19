package assignment1;

public class ThirtyOneDayMonth extends Calendar {
    public ThirtyOneDayMonth(int day, int month, int year) {
        super(day, month, year);
        setMonthEnd(31);
    }
}
