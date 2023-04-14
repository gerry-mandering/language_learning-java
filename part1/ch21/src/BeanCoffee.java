public class BeanCoffee {
    private int money;

    public String buying(int money) {
        this.money += money;

        if (money == Menu.BEANAMERICANO)
            return "Bought BeanAmericano!";
        else if (money == Menu.BEANLATTE)
            return "Bought BeanLatte!";
        else
            return null;
    }
}
