import java.util.Comparator;

public class SortStudentByGPA implements Comparator<Student> {
    @Override
    public int compare(Student studen1, Student studen2) {
        if (studen1.getGpa() > studen2.getGpa())
            return 1;
        return -1;
    }
}
