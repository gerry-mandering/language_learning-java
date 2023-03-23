package pr1;

public class SuperLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("Running Super Fast");
    }

    @Override
    public void jump() {
        System.out.println("Jump Super High!");
    }

    @Override
    public void turn() {
        System.out.println("Do Turn!");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("**** SuperHigh Level ****");
    }
}
