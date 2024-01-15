package OOP_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flow implements Iterable<StudentGroup> {

    private List<StudentGroup> studentGroups;

    public Flow() {
        studentGroups = new ArrayList<>();
    }

    public void addStudentGroup(StudentGroup studentGroup) {
        studentGroups.add(studentGroup);
    }

    public void removeStudentGroup(StudentGroup studentGroup) {
        studentGroups.remove(studentGroup);
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroups.iterator();
    }
} 
