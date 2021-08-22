package week1_00;

class Student {
    int id = 1001;
    String name = "홍길동";
    int grade = 1;

    public void print() {
        System.out.println("학번: "+id);
        System.out.println("이름: "+name);
        System.out.println("학년: "+grade+"학년");
    }
}

public class sub02{
    void run(){
        Student st = new Student();
        st.print();
    }
    public static void main(String[] args) {
        sub02 sub02 = new sub02();
        sub02.run();
    }
}