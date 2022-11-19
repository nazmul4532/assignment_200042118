package assignment1;

public class February extends Calendar {
    public February(int day, int year) {
        super(day, 2, year);
        if(isLeapYear()) {
            setMonthEnd(29);
        }
        else {
            setMonthEnd(28);
        }
    }
}
