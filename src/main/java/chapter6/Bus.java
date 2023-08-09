package chapter6;

public class Bus {
    int busNo;
    int passengerCount;
    int money;

    public Bus(int busNo){
        this.busNo = busNo;
    }

    public void getPassenger(int money){
        this.passengerCount += 1;
        this.money += money;
    }
}
