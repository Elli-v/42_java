package week3.Student2;

public class Subject {
    private String subjectName;
    private int score;

    Subject(String subjectName, int score){
        this.subjectName = subjectName;
        this.score = score;
    }
    public String getSubjectName(){
        return subjectName;
    }
    public void setSubjectName(String subjectName){
        this.subjectName = subjectName;
    }

    public int getScore(){
        return score;
    }
    public void setScore(int score){
        this.score = score;
    }
}
