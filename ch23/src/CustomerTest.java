public class CustomerTest {
    public static void main(String[] args) {
        int         price = 10000;
        int         cost;
        Customer    customerLee = new Customer(10010, "Lee");

        customerLee.bonusPoint = 1000;
        cost = customerLee.calcPrice(price);
        System.out.println(customerLee.showCustomerInfo() + " payed " + cost);

        VIPCustomer customerKim = new VIPCustomer(10030, "Kim");
        customerKim.bonusPoint = 10000;
        cost = customerKim.calcPrice(price);
        System.out.println(customerKim.showCustomerInfo() + " payed " + cost);

        Customer    customerPark = new VIPCustomer(10020, "Park");
        customerPark.bonusPoint = 10000;
        cost = customerPark.calcPrice(price);
        System.out.println(customerPark.showCustomerInfo() + " payed " + cost);
    }
}
