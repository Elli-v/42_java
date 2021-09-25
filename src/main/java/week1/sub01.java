package week1_00;
import java.util.Scanner;

class sub01Four {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
    public int sub(int num1, int num2) {
        return num1 - num2;
    }
    public int mul(int num1, int num2) {
        return num1 * num2;
    }
    public int div(int num1, int num2) {
        return num1 / num2;
    }
}

public class sub01 {
    public static void main(String[] args) {
        int num1; //클래스 영역에 선언한 변수 = 멤버 변수
        int num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 1을 입력하세요");
        num1 = sc.nextInt();
        System.out.println("숫자 2를 입력하세요");
        num2 = sc.nextInt();

        sub01Four test = new sub01Four();
        int ret0 = test.sum(num1, num2);
        System.out.println(ret0);
        int ret1 = test.sub(num1, num2);
        System.out.println(ret1);
        int ret2 = test.mul(num1, num2);
        System.out.println(ret2);
        int ret3 = test.div(num1, num2);
        System.out.println(ret3);
    }
}