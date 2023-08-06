package chapter2;

public class Student {

    // 속성 : 멤버 변수
    int studentId;
    String studentName;
    int grade;
    String address;

    // 기본 생성자
    // jvm(컴파일러)이 디폴트로 만들어줌! 매개변수 없음 함수내용도 없음
    // 기본 생성자가 아닌 생성자를 추가하면, 컴파일러가 디폴트로 추가해주지 않음
    public Student(){

    }

    // 생성자 오버로딩
    // 기본 생성자를 사용하지 않고, 매개 변수를 받는 경우
    // 생성 시 해당 매개변수를 포함해서 생성해줘야함
    public Student(int id, String name){
        studentId = id;
        studentName = name;
    }

    // 기능 : 메서드
    public void showStudentIdAndStudentName(){
        System.out.println(studentId);
        System.out.println(studentName);
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }

    // 서블릿 : 엔드포인트 없기 때문에
    // main 함수 만든느데 어디에 있든 jvm이 호출하기 때문에 Student class 안에 위치해도 ㄱㅊ
    public static void main(String[] args){
        // class 생성
        // 인스턴스
        Student student1 = new Student();

        // 값 할당
        student1.studentId = 1;
        student1.studentName = "이순신";

        // 메서드 사용
        student1.showStudentIdAndStudentName();

        System.out.println(student1.getStudentName());

        student1.setStudentName("홍길동");
        student1.showStudentIdAndStudentName();

        // 힙 메모리에 생성된 인스턴스의 주소값 출력
        System.out.println(student1);
    }

}
