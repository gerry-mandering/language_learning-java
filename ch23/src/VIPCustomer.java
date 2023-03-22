public class VIPCustomer extends Customer {
    private int agentId;
    double      salesRatio;

    public VIPCustomer(int customerId, String customerName) {

        super(customerId, customerName);
        this.customerGrade = "VIP";
        this.salesRatio = 0.1;
        this.bonusRatio = 0.05;

        System.out.println("VIPCustomer called");
    }

    @Override
    public int calcPrice(int price) {
        this.bonusPoint += price * this.bonusRatio;

        return (price - (int)(price * this.salesRatio));
    }

    public int getAgentId() {
        return agentId;
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + " agentId is " + agentId;
    }
}
