package week2;


class Subject {
    String subjectName;
    int subjectScore;
}

public class Student {

    int studentID;
    String studentName;

    Subject korean;
    Subject math;

    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;

        korean = new Subject();
        math = new Subject();
    }

    public void setKorean (String koreaSubject, int koreaScore){
        korean.subjectName = koreaSubject;
        korean.subjectScore = koreaScore;
    }

    public void setMath (String mathSubject, int mathScore){
        math.subjectName = mathSubject;
        math.subjectScore = mathScore;
    }

    public void showStudentinfo(){
        int total = korean.subjectScore + math.subjectScore;
        System.out.println("학생 "+studentName+"의 총점은 "+total+" 입니다.");
    }
}
