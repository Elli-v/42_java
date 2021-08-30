package week2.TakeTrans;

public class Coffeebeans {
    private String coffeeMenu;
    private int passengerCnt;
    private int income;
    private int beanLatte = 4000;

    public Coffeebeans(String coffeeMenu){
        this.coffeeMenu = coffeeMenu;
    }

    public void take(String coffeeMenu, int income){
        if (coffeeMenu == "라떼" && income == this.beanLatte){
            this.income += income;
            passengerCnt++;
//            System.out.println ("커피빈에서 라떼를 구입했습니다.");
        }
    }

    public void showCoffeebeansInfo() {
        System.out.println("커피빈에 방문한 고객은 "+passengerCnt+"명 이고 수입은 "+income+"입니다.");
    }
}
