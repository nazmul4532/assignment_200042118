package assignment1;

public class Calendar {
    private int month;
    private int day;
    private int year;

    private int monthEnd;

    public Calendar(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    protected void setMonthEnd(int monthEnd){
        this.monthEnd = monthEnd;
    }
    public int getDay() { return day;}
    public int getMonth() { return month;}
    public int getYear() { return year;}

    public String getDateFormat(){
        String str = day +"/"+month +"/"+year;
        return str;
    }
    public void nextDate(){
        if(day == monthEnd) {
            day = 1;
            if (month == 12) {
                month =1;
                year++;
            }
            else{
                month++;
            }
        }
        else{
            day++;
        }
    }
    public boolean isLeapYear(){
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        else {
            return false;
        }
    }

}
