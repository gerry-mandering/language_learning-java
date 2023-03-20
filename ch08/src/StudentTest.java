public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "Lee");
        Student studentKim = new Student(101, "Kim");

        studentLee.setKoreanSubject("Korean", 100);
        studentLee.setMathSubject("Math", 95);

        studentKim.setKoreanSubject("Korean", 80);
        studentKim.setMathSubject("Math", 90);

        studentLee.showStudentScore();
        studentKim.showStudentScore();
    }
}
