public class ManualCar extends Car {
    @Override
    public void drive() {
        System.out.println("Human is Driving");
        System.out.println("Human turns the wheel");
    }

    @Override
    public void stop() {
        System.out.println("Human stops the Car with break");
    }

    public void fuel() {
        System.out.println("MaualCar is getting fuel");
    }

    @Override
    public void washCar() {
        System.out.println("washing the Car");
    }
}
