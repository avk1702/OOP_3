package OOP_3;


import java.util.Iterator;


public class StudentGroupService {

    private StudentGroup studentGroup;

    public void removeStudentByFIO(String firstName, String lastName, String midleName) {
        Iterator<Student> iterator = studentGroup.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName) && student.getMidleName().equals(midleName)) {
                iterator.remove();
            } 
            
        }

    }

   
    
}
