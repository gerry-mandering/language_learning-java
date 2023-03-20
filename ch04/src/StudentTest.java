public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "Lee");
        Student studentKim = new Student(101, "Kim");

        studentLee.studentAddress = "Seoul";

        studentKim.studentAddress = "New York";

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();

        System.out.println(studentLee);
        System.out.println(studentKim);
    }
}
