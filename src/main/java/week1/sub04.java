package week1_00;

class information {
    String name;
    int age;
    String sex;
    String married;
    int child;

    public information(){
        this("-", 0, "-", "-", 0);
    }

    public information(String name){
        this(name, 30, "여성", "기혼", 1);
    }

    public information(String name, int age, String sex, String married, int child){
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

public class sub04 {
    public static void main(String[] args) {
        information people = new information("제인");
        people.print();
    }
}
