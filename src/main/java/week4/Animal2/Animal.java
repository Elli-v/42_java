package week4.Animal2;

public abstract class Animal {
    public Animal(){
    }
    public abstract void move();
}

class Human extends week4.Animal2.Animal {
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }
    public void read() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends week4.Animal2.Animal {
    public void move(){
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
    public void hunt() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends week4.Animal2.Animal {
    public void move() {
        System.out.println("독수리가 하늘을 날아갑니.");
    }
    public void flying() {
        System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
    }
}