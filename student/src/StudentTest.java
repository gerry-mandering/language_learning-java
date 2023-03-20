public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student("Lee");
        Student studentKim= new Student("Kim");

        studentLee.addSubject("korean", 100);
        studentLee.addSubject("math", 50);

        studentKim.addSubject("korean", 70);
        studentKim.addSubject("math", 85);
        studentKim.addSubject("english", 100);

        studentLee.showEachScore();
        studentKim.showEachScore();

        System.out.println("Lee's total score is " + studentLee.getTotalScore());
        System.out.println("Kim's total score is " + studentKim.getTotalScore());
    }
}
