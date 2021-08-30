package week2.TakeTrans;

public class Starbucks {
    private String coffeeMenu;
    private int passengerCnt;
    private int income;
    private int starAmericano = 3000;

    public Starbucks(String coffeeMenu){
        this.coffeeMenu = coffeeMenu;
    }

    public void take(String coffeeMenu, int income){
        if (coffeeMenu == "아메리카노" && income == this.starAmericano){
            this.income += income;
            passengerCnt++;
//            System.out.println ("스타벅스에서 아메리카노를 구입했습니다.");
        }
    }

    public void showStarbucksInfo() {
        System.out.println("스타벅스에 방문한 고객은 "+passengerCnt+"명 이고 수입은 "+income+"입니다.");
    }
}
