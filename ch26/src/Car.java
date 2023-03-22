public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public abstract void fuel();

    public void startCar() {
        System.out.println("Start a Car!");
    }

    public void turnOff() {
        System.out.println("Turn off the Car");
    }

    public void washCar() {}

    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
        fuel();
        washCar();
    }
}
