package week1_00;
import java.util.Scanner;

class Student_scan {
    int id;
    String name;
    int grade;

    public void read(Scanner scan) {
        System.out.println("학번을 입력하세요");
        id = scan.nextInt();
        System.out.println("이름을 입력하세요");
        name = scan.next();
        System.out.println("학년을 입력하세요 (숫자만)");
        grade = scan.nextInt();
    }

    public void print() {
        System.out.println("학번: "+id);
        System.out.println("이름: "+name);
        System.out.println("학년: "+grade+"학년");
    }
}

public class sub02_scan{
    Scanner scan = new Scanner(System.in);
    void run(){
        Student_scan st = new Student_scan();
        st.read(scan);
        st.print();
    }
    public static void main(String[] args) {
        sub02_scan sub02_scan = new sub02_scan();
        sub02_scan.run();
    }
}
