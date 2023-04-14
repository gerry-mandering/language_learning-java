public class Subway {
    int lineNumber;
    int passengerCount;
    int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money) {
        this.money += money;
        this.passengerCount++;
    }

    public void showSubwayInfo() {
        System.out.println(this.lineNumber + "th Subway has "
                + this.passengerCount + " passengers, and income is "
                + this.money + " won");
    }
}
