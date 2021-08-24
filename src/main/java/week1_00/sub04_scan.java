package week1_00;

import java.util.Scanner;

class information_scan {
    String name;
    int age;
    String sex;
    String married;
    int child;

    public information_scan(){
        this("-", 0, "-", "-", 0);
    }

    public void read(Scanner scan){
        System.out.println("당신의 이름은 무엇인가요?");
        this.name = scan.next();
        System.out.println("나이를 입력해 주세요 (숫자만)");
        this.age = scan.nextInt();
        System.out.println("성별이 무엇인가요 (여성 or 남성)");
        this.sex = scan.next();
        System.out.println("기혼 or 미혼");
        this. married = scan.next();
        System.out.println("자녀가 몇 명 있나요? (숫자만)");
        this. child = scan.nextInt();
    }

    public information_scan(String name, int age, String sex, String married, int child){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.married = married;
        this.child = child;
    }

    public void print() {
        System.out.println("이름은 "+name+"이고 나이는 "+age+"살 입니다.");
        System.out.println("성별은 "+sex+"이며, "+married+"자 입니다. 자녀는 "+child+"명이 있습니다.");
    }
}

public class sub04_scan {
    Scanner scan = new Scanner(System.in);
    void run(){
        information_scan info = new information_scan();
        info.read(scan);
        info.print();
    }
    public static void main(String[] args) {
        sub04_scan sub04_scan = new sub04_scan();
        sub04_scan.run();
    }
}