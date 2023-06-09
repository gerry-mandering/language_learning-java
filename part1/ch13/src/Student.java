public class Student {
    String  studentName;
    int     grade;
    int     money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(1200);
        this.money -= 1000;
    }

    public void showStudentInfo() {
        System.out.println(this.studentName + "'s remaining money is " + this.money + " won");
    }
}
