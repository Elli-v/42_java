package week3.Student;

public class Student {
    public static int SerialNum = 1000;
    int studentID;
    String studentName;

    public void Student(String studentName){
        setStudentName(studentName);
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public static int  getSerialNum(){
        return SerialNum;
    }

    public Student(){
        SerialNum++;
        studentID = SerialNum;
    }
}

//public class Student {
//    static int serialNum = 1000;
//    int studentID;
//    String studentName;
//
//    public Student() {
//        this.studentID = ++Student.serialNum;
//    }
//    public Student(String studentName) {
//        this.studentName = studentName;
//        this.studentID = ++Student.serialNum;
//    }
//
//    // Setter
//    public void setStudentId(int studentId) {
//        this.studentID = studentId;
//    }
//
//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }
//
//    // Getter
//    public static int getSerialNum() {
//        return Student.serialNum;
//    }
//    public int getStudentId() {
//        return studentID;
//    }
//    public String getStudentName() {
//        return studentName;
//    }
//
//}