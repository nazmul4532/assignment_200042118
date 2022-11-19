package assignment2.dataCoupling;
import java.util.ArrayList;

public class AttendanceSheet {
    public ArrayList<String> students;
    public void addStudent(String name)
    {
        students.add(name);
    }
}
//Here, we need only the students name but we are receiving the entire object.
//This is an example of stamp coupling.