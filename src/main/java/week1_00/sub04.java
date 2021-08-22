package week1_00;

class information {
    String name = "제인";
    int age = 30;
    String sex = "여성";
    String married = "기혼자";
    int child = 1;

    public void print() {
        System.out.println("이름은 "+name+"이고 나이는 "+age+"살 입니다.");
        System.out.println("성별은 "+sex+"이며, "+married+" 입니다. 자녀는 "+child+"명이 있습니다.");
    }
}

public class sub04 {
    void run(){
        information st = new information();
        st.print();
    }
    public static void main(String[] args) {
        sub04 sub04 = new sub04();
        sub04.run();
    }
}
