package week2.TakeTrans;

public class Bus {
    private int busNum;
    private int passengerCnt;
    private int income;

    public  Bus(int busNum){
        this.busNum = busNum;
        this.passengerCnt = 0;
    }

    public void take(int income){
        this.income += income;
        passengerCnt++;
    }

    public void showBusInfo() {
        System.out.println(busNum+"번 버스의 승객은 "+passengerCnt+"명 이고 수입은 "+income+"입니다.");
    }
}
