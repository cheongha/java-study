package chapter6;

public class Student {
    final int BUS_PRICE = 1000;
    String studentName;
    int grade;
    int money;
    public Student(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus){
        System.out.println("승객 1명 버스 탑승");
        bus.getPassenger(BUS_PRICE);
        this.money -= BUS_PRICE;
    }
}
