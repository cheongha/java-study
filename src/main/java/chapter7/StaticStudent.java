package chapter7;

public class StaticStudent {

    // static int serialNum = 10000;
    // 외부에서 변경을 막기 위해서 private 로 선언
    private static int serialNum;
    int studentId;
    int studentName;

    // 자동으로 학생 id를 1씩 증가시켜서 채번

    public StaticStudent(){
        // 같이 공유 되어서 증가될 것이며
        serialNum ++;

        // 각 인스턴스는 각각의 id를 할당받아 사용 가조
        studentId = serialNum;
    }

    public static int getSerialNum(){
        // 지역 변수 O -> 메서드 호출 시 생성 ~ 호출 시 종료
        int i = 0;
        i ++;
        System.out.println(i);

        // 인스턴스(멤버) 변수 X -> 인스턴스 생성되었을때
        // 인스턴스 변수는 꼭 인스턴스가 생성되어야 하므로
        // static 메서드에서는 생성이 불확실한 인스턴스 변수 사용 불가능
        // studentName = "로로";

        return serialNum; // static 변수, 클래스 변수
    }
}
