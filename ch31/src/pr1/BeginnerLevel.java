package pr1;

public class BeginnerLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("Running slowly");
    }

    @Override
    public void jump() {
        System.out.println("Cannot Jump!");
    }

    @Override
    public void turn() {
        System.out.println("Cannot Turn!");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("**** Beginner Level ****");
    }
}
