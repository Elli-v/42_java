package week4.Customer3;
import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        //1번
        Customer customerLee = new Customer(10010,"이순신");
        Customer customerShin = new Customer(10020,"신사임당");
        Customer customerHong = new GOLDCustomer(10030,"홍길동");
        Customer customerYul = new GOLDCustomer(10040,"이율곡");
        Customer customerKim = new VIPCustomer(10050,"김유신",12345);
        //2번
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        customerList.add(customerLee);
        customerList.add(customerShin);
        customerList.add(customerHong);
        customerList.add(customerYul);
        customerList.add(customerKim);
        //3번
        System.out.println("===========고객정보출력===========");
        for(Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }
        //4번
        System.out.println("===============물건 구입 후 정보 ===========");
        int price = 10000;
        for(Customer customer : customerList) {
            int afterPrice = customer.calcPrice(price);
            System.out.println(customer.customerName +"님이 현재"+afterPrice+"원 지불하셨습니다.");
            System.out.println(customer.customerName + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
        }

    }

}
