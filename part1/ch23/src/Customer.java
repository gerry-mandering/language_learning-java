public class Customer {
    protected int     customerId;
    protected String  customerName;
    protected String  customerGrade;

    int             bonusPoint;
    double          bonusRatio;

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;

        customerGrade = "Silver";
        bonusRatio = 0.01;

        System.out.println("Customer called");
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public String showCustomerInfo() {
        return (customerName + "'s Grade is " + customerGrade + " and, BounsPoint is " + bonusPoint);
    }
}