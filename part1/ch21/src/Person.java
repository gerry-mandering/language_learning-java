public class Person {
    String  name;
    int     money;

    Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void buyStarCoffee(StarCoffee sCoffee, int money) {
        String  message = sCoffee.buying(money);

        if (message != null) {
            this.money -= money;
            System.out.println(this.name + message + " with " + money);
        }
    }

    public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
        String  message = bCoffee.buying(money);

        if (message != null) {
            this.money -= money;
            System.out.println(this.name + message + " with " + money);
        }
    }
}
