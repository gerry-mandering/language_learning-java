package pr1;

public class AdvancedLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("Running Fastly");
    }

    @Override
    public void jump() {
        System.out.println("Do High Jump!");
    }

    @Override
    public void turn() {
        System.out.println("Cannot Turn!");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("**** Advanced Level ****");
    }
}
