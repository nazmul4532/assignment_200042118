package assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import assignment1.GivenCode;

public class GivenCodeTest {
    @Test
    public void testDate(){
        GivenCode cal = new GivenCode(10,2,2002);
        String str = cal.getDateFormat();
        assertEquals("2/10/2002",str);
    }
    @Test
    public void testNextDate(){
        GivenCode cal = new GivenCode(10,2,2002);
        cal.nextDate();
        String str = cal.getDateFormat();
        assertEquals("3/10/2002",str);
    }
    @Test
    public void testNextDate02(){
        GivenCode cal = new GivenCode(10,2,2002);
        cal.nextDate();
        cal.nextDate();
        cal.nextDate();
        cal.nextDate();
        cal.nextDate();
        cal.nextDate();
        cal.nextDate();
        String str = cal.getDateFormat();
        assertEquals("9/10/2002",str);
    }
    @Test
    public void testNextDate30DaysMonthEnd(){
        GivenCode cal = new GivenCode(11,30,2002);
        cal.nextDate();
        String str = cal.getDateFormat();
        assertEquals("1/12/2002",str);
    }
    @Test
    public void testNextDate30DaysNotMonthEnd(){
        GivenCode cal = new GivenCode(10,30,2002);
        cal.nextDate();
        String str = cal.getDateFormat();
        assertEquals("31/10/2002",str);
    }
    @Test
    public void testNextDate31DaysMonthEnd(){
        GivenCode cal = new GivenCode(10,31,2002);
        cal.nextDate();
        String str = cal.getDateFormat();
        assertEquals("1/11/2002",str);
    }
    @Test
    public void testNextDateFebLeapYear01(){
        GivenCode cal = new GivenCode(2,28,2000);
        cal.nextDate();
        String str = cal.getDateFormat();
        assertEquals("29/2/2000",str);
        cal.nextDate();
        str = cal.getDateFormat();
        assertEquals("1/3/2000",str);
    }
    @Test
    public void testNextDateFebLeapYear02(){
        GivenCode cal = new GivenCode(2,29,2000);
        cal.nextDate();
        String str = cal.getDateFormat();
        assertEquals("1/3/2000",str);
    }
    @Test
    public void testNextDateFebNotLeapYear01(){
        GivenCode cal = new GivenCode(2,28,1700);
        cal.nextDate();
        String str = cal.getDateFormat();
        assertEquals("1/3/1700",str);
    }
    @Test
    public void testNextDateFebNotLeapYear02(){
        GivenCode cal = new GivenCode(2,28,2002);
        cal.nextDate();
        String str = cal.getDateFormat();
        assertEquals("1/3/2002",str);
    }
    @Test
    public void testNextDateFebNotLeapYear03(){
        GivenCode cal = new GivenCode(2,29,2002);
        cal.nextDate();
        cal.nextDate();
        cal.nextDate();
        cal.nextDate();
        cal.nextDate();
        cal.nextDate();
        String str = cal.getDateFormat();
        assertEquals("29/2/2002",str);
        //The date is stuck on 29/2/2002. It is no longer updating.
        //This is an error. This date format should not be accepted as an input.
    }
    @Test
    public void testNextDateFebNotLeapYear04(){
        GivenCode cal = new GivenCode(2,8,2002);
        cal.nextDate();
        cal.nextDate();
        cal.nextDate();
        cal.nextDate();
        String str = cal.getDateFormat();
        assertEquals("8/2/2002",str);
        //The date is stuck on 8/2/2002. It is no longer updating.
        //Day increment was not implemented in February when it is not a leap year.
    }
    @Test
    public void testNextDateYearEnd(){
        GivenCode cal = new GivenCode(12,31,2002);
        cal.nextDate();
        String str = cal.getDateFormat();
        assertEquals("1/13/2003",str);
        //This is another error which can and should be easily fixed.
        //The year does increase but.
        //The month doesn't reset to 1. Rather keeps increasing infinitely, breaking the calendar.
        //It will always be stuck on the new year.
    }
    @Test
    public void testNextDateInputDayOutOfRange(){
        GivenCode cal = new GivenCode(3,68,2002);
        cal.nextDate();
        String str = cal.getDateFormat();
        assertEquals("69/3/2002",str);
        //This is another error which can and should be easily fixed.
        //The keeps increasing infinitely form here on out, breaking the calendar.
        //It will always be stuck on the same month and the same year.
    }
    @Test
    public void testNextDateInputMonthOutOfRange(){
        GivenCode cal = new GivenCode(26,12,2002);
        cal.nextDate();
        String str = cal.getDateFormat();
        assertEquals("13/26/2002",str);
        //This is another error which can and should be easily fixed.
        //It breaks the calendar as it will be stuck on the same year forever.
    }
}
