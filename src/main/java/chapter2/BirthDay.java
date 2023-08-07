package chapter2;

public class BirthDay {

    // 접근제어 안쓰는 경우, 패키지 내에서는 접근 가능
    int day;
    int month;
    int year;

    // 1. 자신의 메모리를 가리키는 this
    public void setYear(int year) {
        this.year = year;
    }


    // 2. 생성자에서 다른 생성자 호출
    public BirthDay(){
        // int day = 0 ; this 사용할 때는 앞에 어떤 구문도 오면 안됨.
        // 아래 this ~~ 구문이 실행된 후에야 생성이 완료 되기 때문
        // 생성되지 않은 메모리에 값을 할당하게 되는 오류가 발생할 수 있기때문
        this(26, 5, 2023);
    }

    public BirthDay(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }


    // 3. 자신의 주소를 반환
    public void printThis(){
        System.out.println(this);
    }

    public BirthDay returnSelf(){
        return this;
    }

    public static void main(String[] args){
        BirthDay day1 = new BirthDay();
        BirthDay day2 = new BirthDay();

        System.out.println(day1.year);
        day1.setYear(1999); // day는 참조 변수
        System.out.println(day1.year);

        System.out.println(day1);
        System.out.println(day2);

        day1.printThis();
        day2.printThis();

        System.out.println(day1.returnSelf());
        System.out.println(day2.returnSelf());

        // => 인스턴스마다 다른 주소 값을 가짐


    }
}
