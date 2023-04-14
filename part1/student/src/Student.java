import java.util.ArrayList;

public class Student {
    private static int          currentId = 1000;

    private String              name;
    private int                 id;
    private ArrayList<Subject>  subjects = new ArrayList<>();

    public Student(String name) {
        this.name = name;
        this.id = ++currentId;
    }

    public void addSubject(String name, int score) {
        Subject temp = new Subject(name, score);

        subjects.add(temp);
    }

    public void showEachScore() {
        System.out.print("id " + this.id + " - " + this.name + " student's Score: ");

        for (Subject subject : subjects) {
            System.out.print(subject.getName() + " is " + subject.getScore());
            if (subject != subjects.get(subjects.size() - 1))
                System.out.print(", ");
        }

        System.out.println();
    }

    public int getTotalScore() {
        int totalScore = 0;

        for (Subject subject : subjects) {
            totalScore += subject.getScore();
        }

        return totalScore;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
