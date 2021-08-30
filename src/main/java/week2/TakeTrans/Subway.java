package week2.TakeTrans;

public class Subway {
    private int subwayNum;
    private int passengerCnt;
    private int income;

    public Subway(int subwayNum){
        this.subwayNum = subwayNum;
    }

    public void take(int income){
        this.income += income;
        passengerCnt++;
    }

    public void showSubwayInfo() {
        System.out.println(subwayNum+"번 버스의 승객은 "+passengerCnt+"명 이고 수입은 "+income+"입니다.");
    }
}
