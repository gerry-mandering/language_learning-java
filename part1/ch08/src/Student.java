public class Student {
    private int     studentId;
    private String  studentName;

    Subject korean;
    Subject math;

    public  Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        this.korean = new Subject();
        this.math = new Subject();
    }

    public void setKoreanSubject(String name, int score) {
        this.korean.subjectName = name;
        this.korean.score = score;
    }

    public void setMathSubject(String name, int score) {
        this.math.subjectName = name;
        this.math.score = score;
    }

    public void showStudentScore() {
        int total = this.korean.score + this.math.score;

        System.out.println(this.studentName + "Student's total score is " + total);
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int  getStudentId() {
        return this.studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
