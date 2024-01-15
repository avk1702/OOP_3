package OOP_3;

import java.util.List;

import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {
    private int count;
    
    private final List<Student> studentlList;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.count = 0;
        this.studentlList = studentGroup.getStudentList();
    }

    @Override
    public boolean hasNext() {
        return count < studentlList.size() - 1;
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            return null;  
        }
        count++;
        return studentlList.get(count);
    }

    @Override
    public void remove() {
        studentlList.remove(count);
    }
    
}
