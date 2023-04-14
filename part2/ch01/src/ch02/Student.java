package ch02;

public class Student implements Cloneable{

    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {

            Student inputStudent = (Student) obj;
            if (this.studentId == inputStudent.studentId)
                return true;
            else
                return false;

        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return studentId;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return studentName;
    }
}
