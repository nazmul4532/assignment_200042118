package assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import assignment1.CalendarFactory;

public class CalendarTest {
    @Test
    public void testDate() {
        String str;
        try {
        CalendarFactory calendar = new CalendarFactory(10,2,2002);
        str = calendar.cal.getDateFormat();
        } catch (Exception e) {
            str = e.getMessage();
        }
        assertEquals("2/10/2002",str);
    }
    @Test
    public void testNextDate() {
        String str;
        try {
        CalendarFactory calendar = new CalendarFactory(10,2,2002);
        calendar.cal.nextDate();
        str = calendar.cal.getDateFormat();
        } catch (Exception e) {
            str = e.getMessage();
        }
        assertEquals("3/10/2002",str);
    }
    @Test
    public void testNextDate02() {
        String str;
        try {
        CalendarFactory calendar = new CalendarFactory(10,2,2002);
        calendar.cal.nextDate();
        calendar.cal.nextDate();
        calendar.cal.nextDate();
        calendar.cal.nextDate();
        calendar.cal.nextDate();
        calendar.cal.nextDate();
        calendar.cal.nextDate();
        str = calendar.cal.getDateFormat();
        } catch (Exception e) {
            str = e.getMessage();
        }
        assertEquals("9/10/2002",str);
    }
    @Test
    public void testNextDate30DaysMonthEnd() {
        String str;
        try {
        CalendarFactory calendar = new CalendarFactory(11,30,2002);
        calendar.cal.nextDate();
        str = calendar.cal.getDateFormat();
        } catch (Exception e) {
            str = e.getMessage();
        }
        assertEquals("1/12/2002",str);
    }
    @Test
    public void testNextDate31DaysNotMonthEnd()  {
        String str;
        try {
        CalendarFactory calendar = new CalendarFactory(10,30,2002);
        calendar.cal.nextDate();
        str = calendar.cal.getDateFormat();
        } catch (Exception e) {
            str = e.getMessage();
        }
        assertEquals("31/10/2002",str);
    }
    @Test
    public void testNextDate31DaysMonthEnd() {
        String str;
        try {
        CalendarFactory calendar = new CalendarFactory(10,31,2002);
        calendar.cal.nextDate();
        str = calendar.cal.getDateFormat();
        } catch (Exception e) {
            str = e.getMessage();
        }
        assertEquals("1/11/2002",str);
    }
    @Test
    public void testNextDateFebLeapYear01()  {
        String str;
        try {
        CalendarFactory calendar = new CalendarFactory(2,28,2000);
        calendar.cal.nextDate();
        str = calendar.cal.getDateFormat();
        assertEquals("29/2/2000",str);
        } catch (Exception e) {
            str = e.getMessage();
        }
    }
    @Test
    public void testNextDateFebLeapYear02() {
        String str;
        try {
        CalendarFactory calendar = new CalendarFactory(2,29,2000);
        calendar.cal.nextDate();
        str = calendar.cal.getDateFormat();
        } catch (Exception e) {
            str = e.getMessage();
        }
        assertEquals("1/3/2000",str);
    }
    @Test
    public void testNextDateFebNotLeapYear01() {
        String str;
        try {
        CalendarFactory calendar = new CalendarFactory(2,28,1700);
        calendar.cal.nextDate();
        str = calendar.cal.getDateFormat();
        } catch (Exception e) {
            str = e.getMessage();
        }
        assertEquals("1/3/1700",str);
    }
    @Test
    public void testNextDateFebNotLeapYear02() {
        String str;
        try {
        CalendarFactory calendar = new CalendarFactory(2,28,2002);
        calendar.cal.nextDate();
        str = calendar.cal.getDateFormat();
        } catch (Exception e) {
            str = e.getMessage();
        }
        assertEquals("1/3/2002",str);
    }
    @Test
    public void testNextDateFebNotLeapYear03() {
        String str;
        try {
            CalendarFactory calendar = new CalendarFactory(2, 29, 2002);
            calendar.cal.nextDate();
            str = calendar.cal.getDateFormat();
        } catch (Exception e) {
            str = e.getMessage();
        }
        assertEquals("Invalid Date. Day out of Range.",str);
        //Throws a day out of range exception.
    }
    @Test
    public void testNextDateYearEnd()  {
        String str;
        try {
        CalendarFactory calendar = new CalendarFactory(12,31,2002);
        calendar.cal.nextDate();
        str = calendar.cal.getDateFormat();
        } catch (Exception e) {
            str = e.getMessage();
        }
        assertEquals("1/1/2003",str);
        //Year change and month update works properly.
    }
    @Test
    public void testNextDateInputDayOutOfRange(){
        String str;
        try {
            CalendarFactory calendar = new CalendarFactory(3, 68, 2002);
            calendar.cal.nextDate();
            str = calendar.cal.getDateFormat();
        } catch (Exception e) {
            str = e.getMessage();
        }
        assertEquals("Invalid Date. Day out of Range.",str);
        //Throws a day out of range exception.
    }
    @Test
    public void testNextDateInputMonthOutOfRange(){
        String str;
        try {
            CalendarFactory calendar = new CalendarFactory(36, 13, 2002);
            calendar.cal.nextDate();
            str = calendar.cal.getDateFormat();
        } catch (Exception e) {
            str = e.getMessage();
        }
        assertEquals("Invalid Date. Month out of Range.",str);
        //Throws a month out of range exception.
    }
}
