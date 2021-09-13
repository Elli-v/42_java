package week4.Customer1;

public class Customer {
    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusRatio;

    public Customer(int customerId, String customerName){
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerGrade = "SILVER";
        this.bonusRatio = 0.01;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
}

class VIPCustomer extends Customer {
    private double saleRatio;

    public VIPCustomer(int customerId, String customerName){
        super(customerId, customerName);
        this.customerGrade = "VIP";
        this.bonusRatio = 0.05;
        this.saleRatio = 0.1;
    }
}
