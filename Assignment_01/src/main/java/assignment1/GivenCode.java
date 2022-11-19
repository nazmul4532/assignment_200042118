package assignment1;

public class GivenCode {
    private int month;
    private int day;
    private int year;
    public GivenCode(int month, int day, int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public String getDateFormat(){
        String str = day +"/"+month +"/"+year;
        return str;
    }
    public void nextDate(){
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 31) {
            day = 1; month++;
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30) {
            day = 1; month++;
        } else if ((month == 12) && day == 31) {
            day = 1; month++; year++;
        } else if ((month == 2)) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                if (day == 29) {
                    day = 1; month++;
                } else {
                    day = day + 1;
                }
            } else {
                if (day == 28) {
                    day = 1; month++;
                }
            }
        } else {
            day = day + 1;
        }
    }

}
