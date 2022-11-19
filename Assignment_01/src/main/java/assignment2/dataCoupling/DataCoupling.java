package assignment2.dataCoupling;

public class DataCoupling {
    public static void main(String[] args){
        AttendanceSheet attendanceSheet = new AttendanceSheet();
        Person person = new Person("Nazmul",22);
        attendanceSheet.addStudent(person.getName());
    }
}
