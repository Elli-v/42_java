package week2.TakeTrans;


import week2.TakeTrans.Passenger;
import week2.TakeTrans.Bus;
import week2.TakeTrans.Subway;

public class TakeTransTest {
    public static void main (String[] args){
        Passenger studentJ = new Passenger("James", 5000);
        Passenger studentT = new Passenger("Tomas", 10000);

        Bus bus100 = new Bus(100);
        Subway subwayGreen = new Subway(2);

        Starbucks Americano = new Starbucks("아메리카노");
        Coffeebeans Latte = new Coffeebeans("라떼");

        studentJ.takeBus(bus100);
        studentT.takeSubway(subwayGreen);

        studentJ.takeStar(Americano);
        studentT.takeBean(Latte);

        studentJ.showInfo();
        studentT.showInfo();

        bus100.showBusInfo();
        subwayGreen.showSubwayInfo();

        Americano.showStarbucksInfo();
        Latte.showCoffeebeansInfo();
    }
}
