package chapter6;

public class Take {

    public static void main(String[] args){
        Student student = new Student("로로", 10000);
        Bus bus = new Bus(1);

        System.out.println("학생 돈 : " + student.money);
        System.out.println("버스 승객 : " + bus.passengerCount);
        System.out.println("버스 돈 : " + bus.money);

        student.takeBus(bus);

        System.out.println("학생 돈 : " + student.money);
        System.out.println("버스 승객 : " + bus.passengerCount);
        System.out.println("버스 돈 : " + bus.money);

    }
}
