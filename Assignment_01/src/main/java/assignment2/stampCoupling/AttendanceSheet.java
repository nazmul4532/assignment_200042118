package assignment2.stampCoupling;
import java.util.ArrayList;

public class AttendanceSheet {
    public ArrayList<String> students;
    public void addStudent(Person student)
    {
        students.add(student.getName());
    }
}
//Here, we need only the students name but we are receiving the entire object.
//This is an example of stamp coupling.