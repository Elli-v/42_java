package week4.Animal1;

public abstract class Animal {
    public Animal(){
    }
    public abstract void move();
}

class Human extends Animal {
//    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }
}

class Tiger extends Animal {
//    @Override
    public void move(){
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
}

class Eagle extends Animal {
//    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아갑니.");
    }
}
