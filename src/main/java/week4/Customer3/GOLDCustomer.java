package week4.Customer3;

public class GOLDCustomer extends Customer{
    private double saleRatio;

    public GOLDCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        this.customerGrade = "GOLD";
        this.bonusRatio = 0.02;
        this.saleRatio = 0.1;
    }

    public int calcPrice (int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price*saleRatio);
    }
}
