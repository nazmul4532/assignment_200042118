package assignment2.stampCoupling;

public class StampCoupling {
    public static void main(String[] args){
        AttendanceSheet attendanceSheet = new AttendanceSheet();
        Person person = new Person("Nazmul",22);
        attendanceSheet.addStudent(person);
    }
}
//Here, we need only the students name. but we are receiving the entire object.
//This is an example of stamp coupling.
//Now attendanceSheet has access to information about person which isn't necessary.