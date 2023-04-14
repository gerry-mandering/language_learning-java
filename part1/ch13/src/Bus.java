public class Bus {
    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) {
        this.money += money;
        this.passengerCount++;
    }

    public void showBusInfo() {
        System.out.println(this.busNumber + "th Bus has "
                            + this.passengerCount + " passengers, and income is "
                            + this.money + " won");
    }
}
