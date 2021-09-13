package week4.Customer3;

public class VIPCustomer extends Customer{
    private int agentNumber;
    private double saleRatio;

    public VIPCustomer(int customerID, String customerName, int agentNumber) {
        super(customerID, customerName);
        this.customerGrade = "VIP";
        this.bonusRatio = 0.05;
        this.saleRatio = 0.1;
        this.agentNumber = agentNumber;
    }

    public int calcPrice (int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price*saleRatio);
    }
}
