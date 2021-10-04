package week6.ex01;

public interface Scheduler {
    void   getNextCall();
    void   sendCallIoAgent();
}

class RoundRobin implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다");
    }

    @Override
    public void sendCallIoAgent() {
        System.out.println("다음 순서를 상담원에게 배분합니다");
    }
}

class LeastJob implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다");
    }

    @Override
    public void sendCallIoAgent() {
        System.out.println("해당 업무가 없거나 대기가 가장 적은 상담원에게 할당합니다");
    }
}

class PriorityAllocation implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("고객 등급이 높은 고객의 전화를 먼저 가지고 옵니다");
    }

    @Override
    public void sendCallIoAgent() {
        System.out.println("업무 기술이 넢은 상담원에게 우선적으로 배분합니다");
    }
}