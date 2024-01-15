package OOP_3;

import java.util.List;
import java.util.Iterator;

public class StudentGroup implements Iterable<Student>{
    
    private List<Student> studentlist;

    public List<Student> getStudentList() {
        return studentlist;
    }

    public void setStudentlist(List<Student> studentList) {
        this.studentlist = studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
    
}
