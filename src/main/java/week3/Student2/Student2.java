package week3.Student2;


import java.util.ArrayList;

public class Student2 {
    private int studentID;
    private  String studentName;
    ArrayList<Subject> subjectArrayList = new ArrayList<>();

    public Student2(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentID;
    }

    public void setStudentId(int studentId) {
        this.studentID = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void addSubject(String subjectName, int score) {
        subjectArrayList.add(new Subject(subjectName, score));
    }

    public void showStudentInfo() {
        int total = 0;
        for (Subject value : subjectArrayList) {
            total += value.getScore();
            System.out.println("학생 " + studentName + "의 " + value.getSubjectName() + " 과목 성적은 " + value.getScore() + "입니다.");
        }
        System.out.println("학생 " + studentName + "의 총점은 " + total + "입니다.");
    }
}
