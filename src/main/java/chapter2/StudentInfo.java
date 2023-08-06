package chapter2;

public class StudentInfo {
    int studentId;
    String studentName;
    Subject korea;
    Subject math;

    public StudentInfo(){

    }

    public StudentInfo(int id, String name){
        studentId = id;
        studentName = name;
        korea = new Subject();
        math = new Subject();
    }

    public void setKorea(String name, int score){
        korea.setSubjectName(name);
        korea.score = score;
    }

}
