package week2.TakeTrans;

public class Passenger {
    private String passenger;
    private Bus bus;
    private Subway subway;
    private Starbucks Starbucks;
    private Coffeebeans Coffeebeans;
    int money;

    public Passenger(String passenger, int money) {
        this.passenger = passenger;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        this.bus = bus;
        bus.take(1000);
        money -= 1000;
    }

    public void takeSubway(Subway subway) {
        this.subway = subway;
        subway.take(1200);
        money -= 1200;
    }

    public void takeStar(Starbucks Starbucks){
        this.Starbucks = Starbucks;
        Starbucks.take("아메리카노", 3000);
        money -= 3000;
    }

    public void takeBean(Coffeebeans Coffeebeans){
        this.Coffeebeans = Coffeebeans;
        Coffeebeans.take("라떼", 4000);
        money -= 4000;
    }

    public void showInfo() {
        System.out.println(passenger + "님의 남은 돈은 " + money + "입니다.");
    }
}
