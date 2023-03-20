public class StarCoffee {
    private int money;

    public String buying(int money) {
        this.money += money;

        if (money == Menu.STARAMERICANO)
            return "Bought StarAmericano!";
        else if (money == Menu.STARLATTE)
            return "Bought StarLatte!";
        else
            return null;
    }
}
