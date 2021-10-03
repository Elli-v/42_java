package week6.ex01;
import java.io.IOException;

public class ex01 {
    public static void main (String [] args) throws IOException {
        System.out.println("전화 상담 할당 방식을 선택하세요. (종료는 q를 입력해 주세요");
        System.out.println("R : 한 명씩 차례대로 할당");
        System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
        System.out.println("P : 우선 순위가 높은 고객 먼저 할당");

        int ch = System.in.read();

        Scheduler s = null;

        if (ch == 'R' || ch == 'r'){
            s = new RoundRobin();
        }
        else if (ch == 'L' || ch == 'l'){
            s = new LeastJob();
        }
        else if (ch == 'P' || ch == 'p'){
            s = new PriorityAllocation();
        }
        else if (ch == 'Q' || ch == 'q'){
            System.out.println("시스템을 종료합니다");
            System.exit(0);
        }
        else {
            System.out.println("지원하지 않는 기능입니다");
            return;
        }

        s.getNextCall();
        s.sendCallIoAgent();
    }
}
