package week6.ex02;

public class Customer implements Buy, Sell{
    //구현 코드를 가지고 인스턴스 생성된 경우만 호출되는 디폴트 메서드의 경우
    // 두 개의 인터페이스에서 중복되면 구현하는 클래스에서 반드시 재정의를 해야 함
    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void order() {
        System.out.println("customer order");
    }
}
