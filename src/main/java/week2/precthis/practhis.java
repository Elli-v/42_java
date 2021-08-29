package week2.precthis;

public class practhis {
    //본인의 인스턴스 주소
    // 새ㅔㅇ성자에서 다른 생성자를 호출
    // 자기 자신을 반환
    int prac, prac2, prac0;

    public practhis(){
    }
    public practhis(int prac){
        this(prac, 0);
    }
    public practhis(int prac, int prac2){
        this.prac = prac;
        this.prac2 = prac2;
        //자기인스턴스
    }
    public practhis(int prac, int prac2, int prac3){
        this();
        prac0 = prac3;
        //생성자에서 다른 생성자
    }

    public practhis returnthis(){
        System.out.println("this is me");
        return this;
        //  자기자신
    }
    public void notreturnthis(){
    }
}
