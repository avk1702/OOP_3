package OOP_3;

public class Student implements Comparable <Student> {
    
    private Long studentid;
    private String firstName;
    private String lastName;
    
    public Long getStudentid() {
        return studentid;
    }
    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMidleName() {
        return midleName;
    }
    public void setMidleName(String midleName) {
        this.midleName = midleName;
    }
    private String midleName;

    @Override
    public int compareTo(Student o) {
        return this.studentid.compareTo(o.studentid);
    }
    
}
