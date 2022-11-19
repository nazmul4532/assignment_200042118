package assignment1;
import java.util.List;
import java.util.Arrays;

public class CalendarFactory {
    public Calendar cal;
    List<Integer> ThirtyDayMonths = Arrays.asList(4,6,9,11);
    List<Integer> ThirtyOneDayMonths = Arrays.asList(1,3,5,7,8,10,12);

    public CalendarFactory(int month, int day, int year) throws Exception{

        if(ThirtyDayMonths.contains(month))
        {
            if(day>30 || day<1)
            {
                throw new Exception("Invalid Date. Day out of Range.");
            }
            cal = new ThirtyDayMonth(day, month, year);
        }
        else if(ThirtyOneDayMonths.contains(month)){
            if(day>31 || day<1)
            {
                throw new Exception("Invalid Date. Day out of Range.");
            }
            cal = new ThirtyOneDayMonth(day, month, year);
        }
        else if (month == 2){
            if((day>29 || day<1)) {
                throw new Exception("Invalid Date. Day out of Range.");
            }
            cal = new February(day, year);
            if(!cal.isLeapYear() && day>28)
            {
                throw new Exception("Invalid Date. Day out of Range.");
            }
        }else {
            throw new Exception("Invalid Date. Month out of Range.");
        }
    }
}
