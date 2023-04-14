public class AICar extends Car {

    @Override
    public void drive() {
        System.out.println("Auto Driving Mode");
        System.out.println("Turn the car Automatically");
    }

    @Override
    public void stop() {
        System.out.println("Stops Automatically");
    }

    @Override
    public void fuel() {
        System.out.println("AICar is getting fuel");
    }
}
