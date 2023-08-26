package chapter7;

public class Test {
    public static void main(String[] args){
        StaticStudent staticStudent1 = new StaticStudent();
        // System.out.println(staticStudent1.serialNum);
        System.out.println(staticStudent1.getSerialNum());


        // staticStudent1.serialNum ++;

        StaticStudent staticStudent2 = new StaticStudent();
        // System.out.println(staticStudent2.serialNum);
        System.out.println(staticStudent2.getSerialNum());

        // => 동일하게 둘다 같은 값을 공유하고 있음

        System.out.println("Id : " + staticStudent1.studentId);
        System.out.println("Id : " + staticStudent2.studentId);

        // static 변수는 인스턴스보다는 클래스로 직접 참조
        System.out.println(StaticStudent.getSerialNum());
    }
}
